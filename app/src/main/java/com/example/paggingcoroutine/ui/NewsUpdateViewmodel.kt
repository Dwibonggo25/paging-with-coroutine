package com.example.paggingcoroutine.ui

import androidx.lifecycle.ViewModel
import com.example.paggingcoroutine.repository.LoginRepository
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class LoginViewModel @Inject constructor(private val repository: LoginRepository): ViewModel() {

    var mCompositeDisposable = CompositeDisposable()

    override fun onCleared() {
        mCompositeDisposable.dispose()
        super.onCleared()
    }
}