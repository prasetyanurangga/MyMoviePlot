package com.prasetyanurangga.mymovieplot.data.di.component

import android.app.Application
import com.prasetyanurangga.mymovieplot.ui.view.MainActivity
import com.prasetyanurangga.mymovieplot.data.di.module.AppModule
import com.prasetyanurangga.mymovieplot.data.di.module.NetworkModule
import com.prasetyanurangga.mymovieplot.data.repository.MovieRepository
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        NetworkModule::class,
        AppModule::class
    ]
)
interface AppComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(movieRepository: MovieRepository)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder


        @BindsInstance
        fun networkModule(networkModule: NetworkModule): Builder


        fun build(): AppComponent
    }
}