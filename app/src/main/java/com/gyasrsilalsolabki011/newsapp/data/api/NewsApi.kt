package com.gyasrsilalsolabki011.newsapp.data.api

import com.gyasrsilalsolabki011.newsapp.data.dto.ArticlesDto
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET("/v2/top-headlines")
    suspend fun topHeadlines(@Query("country") country: String = "us") : ArticlesDto
}