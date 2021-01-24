package com.pabelpm.punkapibeer.presentation.features

import android.content.Context
import android.content.Intent
import androidx.activity.viewModels
import com.bumptech.glide.Glide
import com.google.gson.Gson
import com.pabelpm.punkapibeer.R
import com.pabelpm.punkapibeer.databinding.BeerDetailsBinding
import com.pabelpm.punkapibeer.presentation.base.BaseActivity
import com.pabelpm.punkapibeer.presentation.model.BeerViewDetails
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BeerDetailsActivity : BaseActivity() {

    private val viewModel: BeerDetailsViewModel by viewModels()
    private lateinit var binding: BeerDetailsBinding

    companion object {
        private const val EXTRA_BEER_DETAILS: String = "EXTRA_BEER_DETAILS"

        fun newIntent(context: Context, beerViewDetails: BeerViewDetails): Intent {
            val intent = Intent(context, BeerDetailsActivity::class.java)
            intent.putExtra(EXTRA_BEER_DETAILS, Gson().toJson(beerViewDetails))
            return intent
        }
    }

    override fun initializeView() {
        binding = BeerDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.beerViewDetails = Gson().fromJson(
            intent.getStringExtra(EXTRA_BEER_DETAILS),
            BeerViewDetails::class.java
        )

        updateInterface(viewModel.beerViewDetails)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun updateInterface(beerViewDetails: BeerViewDetails) {
        setToolbar()
        Glide.with(this)
            .load(beerViewDetails.imageUrl)
            .centerInside()
            .into(binding.imageDetailsBeerImageView)
        binding.nameDetailsBeerTextView.text = beerViewDetails.name
        binding.descriptionDetailsBeerTextView.text = beerViewDetails.description
    }


    private fun setToolbar() {
        supportActionBar?.setIcon(getDrawable(R.drawable.ic_launcher_background))
        supportActionBar?.title = "Beer details"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }


}