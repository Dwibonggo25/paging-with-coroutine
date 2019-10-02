package com.example.paggingcoroutine.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.paggingcoroutine.ui.NewsUpdateViewmodel
import com.example.paggingcoroutine.di.ViewModelFactory
import com.example.paggingcoroutine.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory : ViewModelFactory) : ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(NewsUpdateViewmodel::class)
    internal abstract fun providesNewsUpdateViewmodel(viewModel : NewsUpdateViewmodel) : ViewModel


}