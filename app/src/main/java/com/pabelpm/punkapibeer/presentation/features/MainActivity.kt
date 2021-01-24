package com.pabelpm.punkapibeer.presentation.features

import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.pabelpm.punkapibeer.databinding.ActivityMainBinding
import com.pabelpm.punkapibeer.presentation.adapters.BeersAdapter
import com.pabelpm.punkapibeer.presentation.base.BaseActivity
import com.pabelpm.punkapibeer.presentation.model.BeerViewDetails
import com.pabelpm.punkapibeer.presentation.model.BeerViewRow
import com.pabelpm.punkapibeer.presentation.utils.gone
import com.pabelpm.punkapibeer.presentation.utils.toast
import com.pabelpm.punkapibeer.presentation.utils.toastError
import com.pabelpm.punkapibeer.presentation.utils.visible
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {

    private val viewModel: MainViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun initializeView() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun bindViewActions() {
        super.bindViewActions()
    }

    override fun observeViewModel() {
        super.observeViewModel()

        viewModel.progressVisibility.observe(this, Observer { visibility ->
            if (visibility) {
                binding.circularProgressBar.visible()
            } else {
                binding.circularProgressBar.gone()
            }
        })

        viewModel.beersLiveDataSuccess.observe(
            this, Observer { beersViewList ->
                setAdapter(beersViewList)
            })
        viewModel.beersLiveDataError.observe(this, Observer {
            toastError("Beers could not be recovered, there is an error: $it")
        })


        viewModel.beerByIdLiveDataSuccess.observe(
            this, Observer { beerViewDetails ->
                startBeerDetailsActivity(beerViewDetails)
            })
        viewModel.beerByIdLiveDataError.observe(this, Observer {
            toastError("Beer could not be recovered, there is an error: $it")
        })
    }

    override fun onResume() {
        super.onResume()
        viewModel.getPageOfBeers(1)
    }


    private fun setAdapter(beerViewRowList: List<BeerViewRow>) {
        val adapter = BeersAdapter()
        binding.beersRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.beersRecyclerView.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )
        binding.beersRecyclerView.adapter = adapter
        adapter.update(beerViewRowList)
        adapter.setOnClickListenerBeer(object :
            BeersAdapter.OnBeerClickListenerAdapter {
            override fun onClickBeer(beerRow: BeerViewRow) {
                super.onClickBeer(beerRow)
                toast("The beer pressed is ${beerRow.name}")
                viewModel.getBeerById(beerRow.id)
            }
        })
    }

    private fun startBeerDetailsActivity(beerViewDetails: BeerViewDetails){
        startActivity(BeerDetailsActivity.newIntent(this, beerViewDetails))

    }
}