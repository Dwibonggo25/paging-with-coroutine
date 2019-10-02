package com.example.paggingcoroutine.ui

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.paggingcoroutine.R
import com.example.paggingcoroutine.databinding.FragmentNewsUpdateBinding
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class NewsUpdateFragment : Fragment() {

    private lateinit var viewModel : NewsUpdateViewmodel

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var binding : FragmentNewsUpdateBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(NewsUpdateViewmodel::class.java)
        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_news_update, container, false)
        binding.apply {
            fragment = this@NewsUpdateFragment
            vm = viewModel
            binding.setLifecycleOwner(activity)
            binding.executePendingBindings()
        }

        return binding.root
    }

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

}
