package com.example.paggingcoroutine.di.module

import com.example.paggingcoroutine.MainActivity
import dagger.android.AndroidInjector
import dagger.Subcomponent



@Subcomponent(modules = [MainActivityModule::class])
interface MainActivityComponent : AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()
}