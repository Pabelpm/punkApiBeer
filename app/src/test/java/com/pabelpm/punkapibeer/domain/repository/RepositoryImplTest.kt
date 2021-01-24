package com.pabelpm.punkapibeer.domain.repository


import kotlinx.coroutines.ExperimentalCoroutinesApi

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