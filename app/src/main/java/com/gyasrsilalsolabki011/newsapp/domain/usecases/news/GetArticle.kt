package com.gyasrsilalsolabki011.newsapp.domain.usecases.news

import com.gyasrsilalsolabki011.newsapp.data.local.NewsDao
import com.gyasrsilalsolabki011.newsapp.domain.models.Article

class GetArticle (
    private val newsDao: NewsDao
) {

    suspend operator fun invoke(url: String): Article?{
        return newsDao.getArticle(url = url)
    }

}