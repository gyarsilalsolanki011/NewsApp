package com.gyasrsilalsolabki011.newsapp.di

import com.gyasrsilalsolabki011.newsapp.data.api.NewsApi
import com.gyasrsilalsolabki011.newsapp.data.repository.NewsRepositoryImpl
import com.gyasrsilalsolabki011.newsapp.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides @Singleton
    fun provideNewsApi(retrofit: Retrofit) : NewsApi {
        return retrofit.create(NewsApi::class.java)
    }

    @Provides @Singleton
    fun provideNewsRepository(api: NewsApi) : NewsRepository {
        return NewsRepositoryImpl(api)
    }
}