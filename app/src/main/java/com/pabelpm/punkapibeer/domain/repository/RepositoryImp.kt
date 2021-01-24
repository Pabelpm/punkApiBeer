package com.pabelpm.punkapibeer.domain.repository

import android.util.Log
import com.pabelpm.punkapibeer.data.datasource.remote.NetworkDataSource
import com.pabelpm.punkapibeer.data.datasource.response.Resource
import com.pabelpm.punkapibeer.data.datasource.response.Status
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
        //Check if have page in room
        val resource = networkDataSource.getBeersByPage(page)
        return if(resource.status == Status.SUCCESS){
            //Save in room PAGE/DATAx
                try {
                    Resource(resource.status, resource.data?.let { beerMapper.listTransform(it) },resource.message)
                }catch (exception: java.lang.Exception){
                    Resource(Status.ERROR, null,exception.message)
                }
        }else{
            Resource(resource.status, null,resource.message)
        }
    }

    override suspend fun getBeerById(id: Int): Resource<Beer> {
        Log.i(TAG, "$REMOTE getBeerById")
        //Check if have beer in room
        val resource = networkDataSource.getBeerById(id)
        return if(resource.status == Status.SUCCESS){
            Resource(resource.status, resource.data?.let { beerMapper.transform(it) },resource.message)
        }else{
            Resource(resource.status, null,resource.message)
        }
    }
}