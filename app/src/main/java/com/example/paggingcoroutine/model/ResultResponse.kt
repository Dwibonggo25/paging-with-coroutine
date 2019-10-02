package com.example.paggingcoroutine.model

data class ResultsResponse<T>(
    val count: Int,
    val next: String? = null,
    val previous: String? = null,
    val results: List<T>
)