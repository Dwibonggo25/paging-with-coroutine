package com.example.paggingcoroutine.di.module

import dagger.Provides
import com.example.paggingcoroutine.MainActivity
import dagger.Module


@Module
class MainActivityModule {

    @Provides
    internal fun provideMainView(mainActivity: MainActivity)= mainActivity

}