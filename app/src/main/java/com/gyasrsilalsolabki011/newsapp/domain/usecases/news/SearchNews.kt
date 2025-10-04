package com.gyasrsilalsolabki011.newsapp.domain.usecases.news

import androidx.paging.PagingData
import com.gyasrsilalsolabki011.newsapp.domain.models.Article
import com.gyasrsilalsolabki011.newsapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class SearchNews(
    private val newsRepository: NewsRepository
) {
    operator fun invoke(searchQuery: String, sources: List<String>): Flow<PagingData<Article>> {
        return newsRepository.searchNews(
            searchQuery = searchQuery,
            sources = sources
        )
    }
}