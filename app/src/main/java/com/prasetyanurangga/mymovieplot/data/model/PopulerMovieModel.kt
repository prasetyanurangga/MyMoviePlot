package com.prasetyanurangga.mymovieplot.data.model

import androidx.lifecycle.LiveData
import com.google.gson.annotations.SerializedName
import com.prasetyanurangga.mymovieplot.data.model.MovieModel


data class PopulerMovieModel (

    @SerializedName("page")
    val page: Long,

    @SerializedName("results")
    val results: List<MovieModel>,

    @SerializedName("total_results")
    val totalResults: Long,

    @SerializedName("total_pages")
    val totalPages: Long
)