package com.gyasrsilalsolabki011.newsapp.domain.repository

import androidx.paging.PagingData
import com.gyasrsilalsolabki011.newsapp.domain.models.Article
import kotlinx.coroutines.flow.Flow

interface NewsRepository {
    suspend fun getTopHeadlines() : Result<List<Article>>
    fun getNews(sources: List<String>): Flow<PagingData<Article>>

    fun searchNews(searchQuery: String, sources: List<String>): Flow<PagingData<Article>>
}