package com.example.paggingcoroutine.di.module

import com.example.paggingcoroutine.MainActivity
import dagger.Module
import android.app.Activity
import dagger.android.AndroidInjector
import dagger.android.ActivityKey
import dagger.multibindings.IntoMap
import dagger.Binds



@Module
abstract class BuilderModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    internal abstract fun bindMainActivity(builder: MainActivityComponent.Builder): AndroidInjector.Factory<out Activity>

}