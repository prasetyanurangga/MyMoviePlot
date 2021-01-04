package com.prasetyanurangga.mymovieplot.data.di.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.prasetyanurangga.mymovieplot.data.repository.MovieRepository
import com.prasetyanurangga.mymovieplot.ui.viewmodel.MovieViewModel
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MovieViewModelFactory @Inject constructor(private var movieRepository: MovieRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MovieViewModel(movieRepository) as T
    }
}