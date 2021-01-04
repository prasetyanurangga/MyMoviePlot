package com.prasetyanurangga.mymovieplot.data.model

import androidx.lifecycle.LiveData
import com.google.gson.annotations.SerializedName


data class DetailMovieModel (
    @SerializedName("adult")
    val adult: Boolean,

    @SerializedName("backdrop_path")
    val backdropPath: String,

    @SerializedName("belongs_to_collection")
    val belongsToCollection: Any? = null,

    @SerializedName("budget")
    val budget: Long,
    
    @SerializedName("genres")
    val genres: List<Genre>,
    
    @SerializedName("homepage")
    val homepage: String,
    
    @SerializedName("id")
    val id: Long,

    @SerializedName("imdb_id")
    val imdbID: String,

    @SerializedName("original_language")
    val originalLanguage: String,

    @SerializedName("original_title")
    val originalTitle: String,

    @SerializedName("overview")
    val overview: String,

    @SerializedName("popularity")
    val popularity: Double,

    @SerializedName("poster_path")
    val posterPath: Any? = null,

    @SerializedName("production_companies")
    val productionCompanies: List<ProductionCompany>,

    @SerializedName("production_countries")
    val productionCountries: List<ProductionCountry>,

    @SerializedName("release_date")
    val releaseDate: String,

    @SerializedName("revenue")
    val revenue: Long,

    @SerializedName("runtime")
    val runtime: Long,

    @SerializedName("spoken_languages")
    val spokenLanguages: List<SpokenLanguage>,

    @SerializedName("status")
    val status: String,

    @SerializedName("tagline")
    val tagline: String,

    @SerializedName("title")
    val title: String,

    @SerializedName("video")
    val video: Boolean,

    @SerializedName("vote_average")
    val voteAverage: Double,

    @SerializedName("vote_count")
    val voteCount: Long
)

data class Genre (

    @SerializedName("id")
    val id: Long,

    @SerializedName("name")
    val name: String
)

data class ProductionCompany (

    @SerializedName("id")
    val id: Long,

    @SerializedName("logo_path")
    val logoPath: String? = null,

    @SerializedName("name")
    val name: String,

    @SerializedName("origin_country")
    val originCountry: String
)

data class ProductionCountry (
    @SerializedName("iso_3166_1")
    val iso3166_1: String,

    @SerializedName("name")
    val name: String
)

data class SpokenLanguage (
    @SerializedName("iso_639_1")
    val iso639_1: String,

    @SerializedName("name")
    val name: String
)
