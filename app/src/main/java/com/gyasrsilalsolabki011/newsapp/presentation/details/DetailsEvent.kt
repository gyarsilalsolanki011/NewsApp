package com.gyasrsilalsolabki011.newsapp.presentation.details

import com.gyasrsilalsolabki011.newsapp.domain.models.Article

sealed class DetailsEvent {
    data class UpsertDeleteArticle(val article: Article) : DetailsEvent()

    object RemoveSideEffect : DetailsEvent()

}