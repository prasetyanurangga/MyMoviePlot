package com.prasetyanurangga.mymovieplot.data.service

import com.prasetyanurangga.mymovieplot.data.model.PopulerMovieModel
import com.prasetyanurangga.mymovieplot.data.model.UpcomingMovieModel
import com.prasetyanurangga.mymovieplot.data.model.DetailMovieModel
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("movie/popular")
    suspend fun getPopulerMovie(@Query("api_key") api_key: String): PopulerMovieModel

    @GET("movie/upcoming")
    suspend fun getUpcomingMovie(@Query("api_key") api_key: String): UpcomingMovieModel

    @GET("movie/{movie_id}")
    suspend fun getDetailMovie(@Query("api_key") api_key: String, @Path("movie_id") id: Int): DetailMovieModel

}