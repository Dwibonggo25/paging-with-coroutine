package com.example.paggingcoroutine.di.module

import com.example.paggingcoroutine.ui.NewsUpdateFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun contributesNewsUpdateFragment(): NewsUpdateFragment

}