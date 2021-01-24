package com.pabelpm.punkapibeer.domain.repository


import com.pabelpm.punkapibeer.builders.BeerDtoBuilder
import com.pabelpm.punkapibeer.data.datasource.remote.NetworkDataSource
import com.pabelpm.punkapibeer.data.datasource.remote.WebService
import com.pabelpm.punkapibeer.data.datasource.response.Resource
import com.pabelpm.punkapibeer.data.datasource.response.Status
import com.pabelpm.punkapibeer.domain.mappers.dtomapper.BeerMapper
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

@ExperimentalCoroutinesApi
class RepositoryImplTest {

/*    private lateinit var repositoryImp: RepositoryImp
    private val responseDto = arrayListOf(BeerDtoBuilder().build())
    lateinit var networkDataSource: NetworkDataSource

    @Mock
    lateinit var webService: WebService

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        networkDataSource = NetworkDataSource(webService)

        repositoryImp = RepositoryImp(
            networkDataSource,
            BeerMapper()
        )
    }

    @Test
    suspend fun checkGetBeersByPage() {
        Mockito.`when`(webService.getBeersByPage(1)).thenReturn(responseDto)

        val response = Resource(Status.SUCCESS, responseDto, "")
        val result = repositoryImp.getBeersByPage(1)

        assertEquals(result, response)
    }*/
}