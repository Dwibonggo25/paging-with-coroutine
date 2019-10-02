package com.example.paggingcoroutine.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.paggingcoroutine.databinding.ListItemBinding
import com.example.paggingcoroutine.model.Article

class NewsUpdateAdapter (private val context : Context) : androidx.recyclerview.widget.ListAdapter<Article, NewsUpdateAdapter.ViewHolder>(DiffCallback) {

    override fun onBindViewHolder(holder: ViewHolder, position: Int)  = holder.bind(getItem(position), context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ListItemBinding.inflate(layoutInflater, parent, false)

        return ViewHolder(binding)
    }

    class ViewHolder (private val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind (model : Article, context : Context){

            binding.executePendingBindings()
        }
    }



    companion object {
        val DiffCallback = object : DiffUtil.ItemCallback<Article>(){
            override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
                return oldItem.content == newItem.content
            }

            override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
                return oldItem == newItem
            }
        }
    }
}