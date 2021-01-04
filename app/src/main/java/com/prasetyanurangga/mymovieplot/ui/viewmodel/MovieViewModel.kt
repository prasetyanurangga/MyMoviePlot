package com.prasetyanurangga.mymovieplot.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.prasetyanurangga.mymovieplot.data.repository.MovieRepository
import com.prasetyanurangga.mymovieplot.util.Constanta
import com.prasetyanurangga.mymovieplot.util.Resource
import kotlinx.coroutines.Dispatchers
import retrofit2.HttpException

class MovieViewModel (private var movieRepository: MovieRepository): ViewModel(){

    var api_key = Constanta.api_key;


    fun getPopulerMovie() = liveData(Dispatchers.IO){
        try {
            emit(
                Resource.success( data = movieRepository.getPopulerMovie(api_key))
            );
        }
        catch (exception :Exception)
        {
            val message = if(exception is HttpException) "Respon Server : "+(exception as HttpException).message() else exception.toString()
            emit(
                Resource.error(data = null, message = message)
            )
        }
    }

    fun getUpcomingMovie() = liveData(Dispatchers.IO){
        try {
            emit(
                Resource.success( data = movieRepository.getUpcomingMovie(api_key))
            );
        }
        catch (exception :Exception)
        {
            val message = if(exception is HttpException) "Respon Server : "+(exception as HttpException).message() else exception.toString()
            emit(
                Resource.error(data = null, message = message)
            )
        }
    }

    fun getDetailMovie(id: Int) = liveData(Dispatchers.IO){
        try {
            emit(
                Resource.success( data = movieRepository.getDetailMovie(api_key, id))
            );
        }
        catch (exception :Exception)
        {
            val message = if(exception is HttpException) "Respon Server : "+(exception as HttpException).message() else exception.toString()
            emit(
                Resource.error(data = null, message = message)
            )
        }
    }


}