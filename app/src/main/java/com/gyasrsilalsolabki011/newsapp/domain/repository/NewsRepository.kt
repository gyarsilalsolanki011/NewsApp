package com.gyasrsilalsolabki011.newsapp.domain.repository

import com.gyasrsilalsolabki011.newsapp.domain.models.Article

interface NewsRepository {
    suspend fun getTopHeadlines() : Result<List<Article>>
}