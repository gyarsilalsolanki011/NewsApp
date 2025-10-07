package com.gyasrsilalsolabki011.newsapp.presentation.bookmark

import com.gyasrsilalsolabki011.newsapp.domain.models.Article

data class BookmarkState(
    val articles: List<Article> = emptyList()
)