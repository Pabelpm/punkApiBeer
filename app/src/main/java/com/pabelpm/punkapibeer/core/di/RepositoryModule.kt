package com.pabelpm.punkapibeer.core.di

import com.pabelpm.punkapibeer.domain.repository.RepositoryImp
import com.pabelpm.punkapibeer.domain.repository.RepositoryInterface
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun provideRepository(imp: RepositoryImp): RepositoryInterface

}