package com.pabelpm.punkapibeer.data.datasource.remote

import com.pabelpm.punkapibeer.data.datasource.response.Resource
import com.pabelpm.punkapibeer.data.datasource.response.ResponseHandler
import com.pabelpm.punkapibeer.data.dto.BeerDto
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

@ExperimentalCoroutinesApi
class NetworkDataSource @Inject constructor(private val webService: WebService) {

    suspend fun getBeersByPage(page: Int): Resource<List<BeerDto>> {
        val responseHandler = ResponseHandler()
        return try {
            responseHandler.handleSuccess(webService.getBeersByPage(page))
        }catch (e: Exception){
            responseHandler.handleException(e)
        }
    }

    suspend fun getBeerById(id: Int): Resource<BeerDto> {
        val responseHandler = ResponseHandler()
        return try {
            responseHandler.handleSuccess(webService.getBeerById(id)[0])
        }catch (e: Exception){
            responseHandler.handleException(e)
        }
    }
}
