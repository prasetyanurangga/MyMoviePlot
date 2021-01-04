package com.prasetyanurangga.mymovieplot.data.di.module

import com.prasetyanurangga.mymovieplot.data.repository.MovieRepository
import com.prasetyanurangga.mymovieplot.data.service.ApiService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideUserRepository(apiService: ApiService): MovieRepository{
        return MovieRepository(apiService)
    }
}