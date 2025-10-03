package com.gyasrsilalsolabki011.newsapp.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import coil.compose.AsyncImage
import com.gyasrsilalsolabki011.newsapp.domain.models.Article

@Composable
fun HomeScreen(modifier: Modifier = Modifier, viewModel: NewsViewModel = hiltViewModel()) {
    val articles by viewModel.state.collectAsState()

    Scaffold { safePadding ->
        LazyColumn(modifier = modifier.padding(safePadding)) {
            items(articles) {
                NewsArticleView(it)
            }
        }
    }
}


@Composable
fun NewsArticleView(article: Article, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .padding(16.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Color.Gray.copy(0.3f))
            .padding(16.dp)
    ) {
        Column {

            AsyncImage(model = article.urlToImage, contentDescription = null, modifier = modifier.fillMaxWidth())
            Text(article.title)
        }
    }
}