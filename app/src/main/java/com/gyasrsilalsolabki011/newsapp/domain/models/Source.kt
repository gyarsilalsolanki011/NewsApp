package com.gyasrsilalsolabki011.newsapp.domain.models

import kotlinx.serialization.Serializable

@Serializable
data class Source(
    val id: String,
    val name: String
)