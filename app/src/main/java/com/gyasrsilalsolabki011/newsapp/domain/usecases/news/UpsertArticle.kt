package com.gyasrsilalsolabki011.newsapp.domain.usecases.news

import com.gyasrsilalsolabki011.newsapp.data.local.NewsDao
import com.gyasrsilalsolabki011.newsapp.domain.models.Article

class UpsertArticle(
    private val newsDao: NewsDao
) {

    suspend operator fun invoke(article: Article){
        newsDao.upsert(article = article)
    }

}