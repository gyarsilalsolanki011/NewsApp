package com.gyasrsilalsolabki011.newsapp.domain.usecases.news

import com.gyasrsilalsolabki011.newsapp.data.local.NewsDao
import com.gyasrsilalsolabki011.newsapp.domain.models.Article
import kotlinx.coroutines.flow.Flow

class GetArticles(
    private val newsDao: NewsDao
) {

    operator fun invoke(): Flow<List<Article>> {
        return newsDao.getArticles()
    }

}