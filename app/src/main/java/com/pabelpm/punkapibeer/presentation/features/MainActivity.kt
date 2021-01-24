package com.pabelpm.punkapibeer.presentation.features

import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.pabelpm.punkapibeer.databinding.ActivityMainBinding
import com.pabelpm.punkapibeer.presentation.base.BaseActivity
import com.pabelpm.punkapibeer.presentation.utils.gone
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

        viewModel.getPageOfBeers(1)
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
                //setAdapter
            })
        viewModel.beersLiveDataError.observe(this, Observer {
            toastError("Beers could not be recovered, there is an error: $it")
        })

    }
}