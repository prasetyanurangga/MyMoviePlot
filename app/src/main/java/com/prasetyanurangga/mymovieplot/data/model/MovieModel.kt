package com.prasetyanurangga.mymovieplot.data.model

import androidx.lifecycle.LiveData
import com.google.gson.annotations.SerializedName

data class MovieModel (
    @SerializedName("poster_path")
    val posterPath: String,

    @SerializedName("adult")
    val adult: Boolean,

    @SerializedName("overview")
    val overview: String,

    @SerializedName("release_date")
    val releaseDate: String,

    @SerializedName("genre_ids")
    val genreIDS: List<Long>,

    @SerializedName("id")
    val id: Long,

    @SerializedName("original_title")
    val originalTitle: String,

    @SerializedName("original_language")
    val originalLanguage: OriginalLanguage,

    @SerializedName("title")
    val title: String,

    @SerializedName("backdrop_path")
    val backdropPath: String,

    @SerializedName("popularity")
    val popularity: Double,

    @SerializedName("vote_count")
    val voteCount: Long,

    @SerializedName("video")
    val video: Boolean,

    @SerializedName("vote_average")
    val voteAverage: Double
)
