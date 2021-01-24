package com.pabelpm.punkapibeer.domain.repository

import com.pabelpm.punkapibeer.data.datasource.response.Resource
import com.pabelpm.punkapibeer.domain.entities.Beer

interface RepositoryInterface {

    suspend fun getBeersByPage(page : Int): Resource<List<Beer>>

    suspend fun getBeerById(id:Int): Resource<Beer>

}