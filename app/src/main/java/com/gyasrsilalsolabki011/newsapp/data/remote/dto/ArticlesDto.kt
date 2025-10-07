package com.gyasrsilalsolabki011.newsapp.data.remote.dto

import com.gyasrsilalsolabki011.newsapp.domain.models.Article
import kotlinx.serialization.Serializable

@Serializable
data class ArticlesDto(
    val status: String,
    val totalResults: Int,
    val articles: List<Article>
)