package com.gyasrsilalsolabki011.newsapp.data.repository

import com.gyasrsilalsolabki011.newsapp.data.api.NewsApi
import com.gyasrsilalsolabki011.newsapp.domain.models.Article
import com.gyasrsilalsolabki011.newsapp.domain.repository.NewsRepository
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(private val api: NewsApi) : NewsRepository {
    override suspend fun getTopHeadlines(): Result<List<Article>> {
        return try {
            Result.success(api.topHeadlines().articles)
        } catch (e : Exception){
            Result.failure(e)
        }
    }
}