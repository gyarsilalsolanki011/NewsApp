package com.gyasrsilalsolabki011.newsapp.domain.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Parcelize
@Serializable
data class Source(
    val id: String,
    val name: String
) : Parcelable