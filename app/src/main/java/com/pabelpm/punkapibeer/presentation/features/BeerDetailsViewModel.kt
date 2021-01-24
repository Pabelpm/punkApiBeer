package com.pabelpm.punkapibeer.presentation.features

import androidx.lifecycle.ViewModel
import com.pabelpm.punkapibeer.presentation.model.BeerViewDetails
import dagger.hilt.android.scopes.ActivityScoped

@ActivityScoped
class BeerDetailsViewModel() : ViewModel() {

    lateinit var beerViewDetails: BeerViewDetails

}