package com.gyasrsilalsolabki011.newsapp.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.gyasrsilalsolabki011.newsapp.data.remote.pagination.NewsPagingSource
import com.gyasrsilalsolabki011.newsapp.data.remote.pagination.SearchNewsPagingSource
import com.gyasrsilalsolabki011.newsapp.data.remote.api.NewsApi
import com.gyasrsilalsolabki011.newsapp.domain.models.Article
import com.gyasrsilalsolabki011.newsapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(
    private val newsApi: NewsApi
) : NewsRepository {

    override suspend fun getTopHeadlines(): Result<List<Article>> {
        return try {
            Result.success(newsApi.topHeadlines().articles)
        } catch (e : Exception){
            Result.failure(e)
        }
    }

    override fun getNews(sources: List<String>): Flow<PagingData<Article>> {
        return Pager(
            config = PagingConfig(pageSize = 10),
            pagingSourceFactory = {
                NewsPagingSource(newsApi = newsApi, sources = sources.joinToString(separator = ","))
            }
        ).flow
    }

    override fun searchNews(searchQuery: String, sources: List<String>): Flow<PagingData<Article>> {
        return Pager(
            config = PagingConfig(pageSize = 10),
            pagingSourceFactory = {
                SearchNewsPagingSource(
                    api = newsApi,
                    searchQuery = searchQuery,
                    sources = sources.joinToString(separator = ",")
                )
            }
        ).flow
    }
}