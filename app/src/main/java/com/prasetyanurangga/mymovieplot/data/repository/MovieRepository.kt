package com.prasetyanurangga.mymovieplot.data.repository

import com.prasetyanurangga.mymovieplot.data.model.MovieModel
import com.prasetyanurangga.mymovieplot.data.model.DetailMovieModel
import com.prasetyanurangga.mymovieplot.data.service.ApiService

class MovieRepository(private val apiService: ApiService) {

    suspend fun getPopulerMovie(api_key: String): List<MovieModel> {
        return apiService.getPopulerMovie(api_key).results
    }

    suspend fun getUpcomingMovie(api_key: String): List<MovieModel> {
        return apiService.getUpcomingMovie(api_key).results
    }

    suspend fun getDetailMovie(api_key: String, id: Int): DetailMovieModel {
        return apiService.getDetailMovie(api_key, id)
    }

}