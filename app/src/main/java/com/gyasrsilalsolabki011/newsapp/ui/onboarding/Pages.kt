package com.gyasrsilalsolabki011.newsapp.ui.onboarding

import androidx.annotation.DrawableRes
import com.gyasrsilalsolabki011.newsapp.R

data class Page(
    val title : String,
    val description: String,
    @param:DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Sacred Pagoda Amid Mist",
        description = "A tiered temple rises gracefully through morning fog in Bali",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Hollywood TenchCrunch",
        description = "Tilly Norwood is not real, but the company that created her hopes that she's the first of many AI-generated stars.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "The Washington Post",
        description = "Health care is key for Democrats in shutdown fight. Here’s what to know.",
        image = R.drawable.onboarding3
    )
)