package com.example.paggingcoroutine.di.component

import com.example.paggingcoroutine.SimpleApp
import com.example.paggingcoroutine.di.module.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AndroidInjectionModule::class,
        NetworkModule::class,
        BuilderModule::class,
        AppModule::class,
        RepositoryModule::class,
        ViewModelModule::class,
        RemoteDataSource::class,
        FragmentModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: SimpleApp): Builder

        fun build(): AppComponent
    }

    fun inject(app: SimpleApp)
}