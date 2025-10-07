package com.gyasrsilalsolabki011.newsapp.presentation.search

import androidx.paging.PagingData
import com.gyasrsilalsolabki011.newsapp.domain.models.Article
import kotlinx.coroutines.flow.Flow

data class SearchState(
    val searchQuery: String = "",
    val articles: Flow<PagingData<Article>>? = null
)
