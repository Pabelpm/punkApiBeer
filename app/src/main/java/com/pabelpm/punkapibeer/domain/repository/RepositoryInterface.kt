package com.pabelpm.punkapibeer.domain.repository

import com.example.openbankmobiletest.repository.response.Resource
import com.pabelpm.punkapibeer.domain.entities.Beer

interface RepositoryInterface {

    suspend fun getBeersByPage(page : Int): Resource<List<Beer>>

}