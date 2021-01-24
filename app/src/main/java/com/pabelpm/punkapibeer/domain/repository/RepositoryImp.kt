package com.pabelpm.punkapibeer.domain.repository

import android.util.Log
import com.example.openbankmobiletest.repository.response.Resource
import com.example.openbankmobiletest.repository.response.Status
import com.pabelpm.punkapibeer.data.datasource.remote.NetworkDataSource
import com.pabelpm.punkapibeer.domain.entities.Beer
import com.pabelpm.punkapibeer.domain.mappers.dtomapper.BeerMapper
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

class RepositoryImp @ExperimentalCoroutinesApi
@Inject constructor(
    private val networkDataSource: NetworkDataSource,
    private val beerMapper: BeerMapper) : RepositoryInterface {

    private val TAG = RepositoryImp::class.java.simpleName
    private val REMOTE = "Remote"

    //Remote DataSource methods
    @ExperimentalCoroutinesApi
    override suspend fun getBeersByPage(page: Int): Resource<List<Beer>> {
        Log.i(TAG, "$REMOTE getBeersByPage")
        val resource = networkDataSource.getBeersByPage(page)
        return if(resource.status == Status.SUCCESS){
            Resource(resource.status, resource.data?.let { beerMapper.listTransform(it) },resource.message)
        }else{
            Resource(resource.status, null,resource.message)
        }
    }
}