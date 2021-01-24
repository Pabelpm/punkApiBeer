package com.pabelpm.punkapibeer.presentation.features

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pabelpm.punkapibeer.data.datasource.response.Status
import com.pabelpm.punkapibeer.domain.entities.Beer
import com.pabelpm.punkapibeer.domain.mappers.dtomapper.BeerMapper
import com.pabelpm.punkapibeer.domain.repository.RepositoryInterface
import dagger.hilt.android.scopes.ActivityScoped
import kotlinx.coroutines.launch

@ActivityScoped
class MainViewModel @ViewModelInject constructor(private val repositoryInterface: RepositoryInterface) : ViewModel() {

    //Could be redundant and too secure
    private val _progressVisibility = MutableLiveData<Boolean>()
    val progressVisibility: LiveData<Boolean> get() = _progressVisibility

    private val _beersLiveDataSuccess = MutableLiveData<List<Beer>>()
    val beersLiveDataSuccess: LiveData<List<Beer>> get() = _beersLiveDataSuccess
    private val _beersLiveDataError = MutableLiveData<String>()
    val beersLiveDataError: LiveData<String> get() = _beersLiveDataError
    
    fun getPageOfBeers(page:Int) {
        viewModelScope.launch {
            val resourceBeersByPage =
                repositoryInterface.getBeersByPage(page)
            when (resourceBeersByPage.status) {
                Status.SUCCESS -> {
                    _beersLiveDataSuccess.postValue(
                        resourceBeersByPage.data?.let { beersList ->
                            //mapperView
                            beersList
                        }
                    )
                }
                Status.ERROR -> _beersLiveDataError.postValue(
                    resourceBeersByPage.message
                )
            }
        }
    }
}