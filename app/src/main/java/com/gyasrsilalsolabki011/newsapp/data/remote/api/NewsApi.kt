package com.gyasrsilalsolabki011.newsapp.data.remote.api

import com.gyasrsilalsolabki011.newsapp.data.remote.dto.ArticlesDto
import com.gyasrsilalsolabki011.newsapp.utils.Constants.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("top-headlines")
    suspend fun topHeadlines(
        @Query("country") country: String = "us"
    ) : ArticlesDto

    @GET("everything")
    suspend fun getNews(
        @Query("sources") sources: String,
        @Query("page") page: Int,
        @Query("apiKey") apiKey: String = API_KEY
    ): ArticlesDto

    @GET("everything")
    suspend fun searchNews(
        @Query("q") searchQuery: String,
        @Query("sources") sources: String,
        @Query("page") page: Int,
        @Query("apiKey") apiKey: String = API_KEY
    ): ArticlesDto

}