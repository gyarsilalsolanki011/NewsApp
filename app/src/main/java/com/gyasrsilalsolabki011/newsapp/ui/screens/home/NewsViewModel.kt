package com.gyasrsilalsolabki011.newsapp.ui.screens.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gyasrsilalsolabki011.newsapp.domain.models.Article
import com.gyasrsilalsolabki011.newsapp.domain.repository.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class NewsViewModel @Inject constructor(private val repository: NewsRepository) : ViewModel() {

    private val mutableState = MutableStateFlow<List<Article>>(emptyList())
    val state = mutableState.asStateFlow()

    init {
        viewModelScope.launch {
            val result = repository.getTopHeadlines()
            result.onSuccess {
                mutableState.value = it
            }
            result.onFailure {  }
        }
    }
}