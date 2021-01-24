package com.pabelpm.punkapibeer.core.di

import com.pabelpm.punkapibeer.domain.mappers.dtomapper.BeerMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class MainModule {

    @Provides
    fun provideBeerMapper(): BeerMapper = BeerMapper()

}