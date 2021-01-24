package com.pabelpm.punkapibeer.data.datasource.remote


import retrofit2.http.GET
import retrofit2.http.Query

interface WebService {

    @GET("v2/beers")
    suspend fun getBeersByPage(@Query(value = "page") page: Int): ArrayList<BeerDto>

}