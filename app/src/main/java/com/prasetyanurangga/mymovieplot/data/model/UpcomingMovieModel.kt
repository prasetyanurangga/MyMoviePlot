package com.prasetyanurangga.mymovieplot.data.model

import androidx.lifecycle.LiveData
import com.google.gson.annotations.SerializedName
import com.prasetyanurangga.mymovieplot.data.model.MovieModel


data class UpcomingMovieModel (

    @SerializedName("page")
    val page: Long,

    @SerializedName("results")
    val results: List<MovieModel>,

    @SerializedName("dates")
    val dates: Dates,

    @SerializedName("total_pages")
    val totalPages: Long,

    @SerializedName("total_results")
    val totalResults: Long
)

data class Dates (

    @SerializedName("maximum")
    val maximum: String,

    @SerializedName("minimum")
    val minimum: String
)
