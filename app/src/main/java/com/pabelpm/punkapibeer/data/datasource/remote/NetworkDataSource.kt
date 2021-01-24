package com.pabelpm.punkapibeer.data.datasource.remote

import com.example.openbankmobiletest.repository.response.Resource
import com.example.openbankmobiletest.repository.response.ResponseHandler
import com.pabelpm.punkapibeer.data.dto.BeerDto
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

@ExperimentalCoroutinesApi
class NetworkDataSource @Inject constructor(private val webService: WebService) {

    suspend fun getBeersByPage(page: Int): Resource<List<BeerDto> >{
        val responseHandler = ResponseHandler()
        return try {
            responseHandler.handleSuccess(webService.getBeersByPage(page))
        }catch (e: Exception){
            responseHandler.handleException(e)
        }
    }
}
