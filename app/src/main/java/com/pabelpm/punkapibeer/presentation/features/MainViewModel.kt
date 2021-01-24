package com.pabelpm.punkapibeer.presentation.features

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pabelpm.punkapibeer.domain.repository.RepositoryInterface
import dagger.hilt.android.scopes.ActivityScoped
import kotlinx.coroutines.launch

@ActivityScoped
class MainViewModel @ViewModelInject constructor(private val repositoryInterface: RepositoryInterface) :
    ViewModel() {

    fun getPageOfBeers(page:Int) {
        viewModelScope.launch {
            repositoryInterface.getBeersByPage(page)
        }
    }
}