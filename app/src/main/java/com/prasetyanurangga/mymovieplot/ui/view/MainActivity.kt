package com.prasetyanurangga.mymovieplot.ui.view

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.*
import com.prasetyanurangga.mymovieplot.MyMoviePlotApplication
import com.prasetyanurangga.mymovieplot.R
import com.prasetyanurangga.mymovieplot.data.di.factory.MovieViewModelFactory
import com.prasetyanurangga.mymovieplot.data.model.MovieModel
import com.prasetyanurangga.mymovieplot.ui.adapter.MoviePopularAdapter
import com.prasetyanurangga.mymovieplot.ui.viewmodel.MovieViewModel
import com.prasetyanurangga.mymovieplot.util.Status
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var movieViewModel: MovieViewModel
    private var moviePopularAdapter : MoviePopularAdapter? = null
    private lateinit var popularGridView: RecyclerView

    lateinit var progressDialog: ProgressDialog

    @Inject
    lateinit var movieViewModelFactory: MovieViewModelFactory

    private var isLoading: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        progressDialog = ProgressDialog(this@MainActivity)
        progressDialog.setCancelable(false)
        progressDialog.setMessage("Please Wait ...")
        init()
        injectDagger()
        createViewModel()

        handleGetPopularMovie()
    }

    private fun init(){
        popularGridView = findViewById(R.id.popular_grid_view)
    }


    private fun createViewModel()
    {
        movieViewModel = ViewModelProvider(this, movieViewModelFactory).get(MovieViewModel::class.java)
    }

    private fun injectDagger()
    {
        MyMoviePlotApplication.instance.appComponent.inject(this)
    }

    private fun handleGetPopularMovie() {
        movieViewModel.getPopulerMovie().observe(this, Observer {
            it?.let { resource ->
                when (resource.status) {
                    Status.SUCCESS -> {
                        setUi(resource.data!!)
                        progressDialog.dismiss()
                    }
                    Status.ERROR -> {
                        Toast.makeText(this, "Terjadi Kesalahan Pada Sistem", Toast.LENGTH_SHORT).show();
                        progressDialog.dismiss()
                    }
                    Status.LOADING -> {
                        if(!progressDialog.isShowing){
                            progressDialog.show()
                        }
                    }
                }
            }
        })
    }

    private fun setUi(listMovie: List<MovieModel>){
        popularGridView.setHasFixedSize(true)
        val gridLayoutManager = GridLayoutManager(this, 2, RecyclerView.VERTICAL, false)
        popularGridView.layoutManager = gridLayoutManager
        val adapter = MoviePopularAdapter(
            this,
            listMovie
        )
        popularGridView.adapter = adapter
    }

}