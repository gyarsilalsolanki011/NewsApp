package com.gyasrsilalsolabki011.newsapp.di

import android.app.Application
import com.gyasrsilalsolabki011.newsapp.data.api.NewsApi
import com.gyasrsilalsolabki011.newsapp.data.manager.LocalUserManagerImpl
import com.gyasrsilalsolabki011.newsapp.data.repository.NewsRepositoryImpl
import com.gyasrsilalsolabki011.newsapp.data.usecases.AppEntryUseCases
import com.gyasrsilalsolabki011.newsapp.data.usecases.ReadAppEntry
import com.gyasrsilalsolabki011.newsapp.data.usecases.SaveAppEntry
import com.gyasrsilalsolabki011.newsapp.domain.manager.LocalUserManager
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

    @Provides @Singleton
    fun provideLocalUserManager(
        application: Application
    ): LocalUserManager = LocalUserManagerImpl(application)

    @Provides @Singleton
    fun provideAppEntryUseCases(
        localUserManager: LocalUserManager
    ) = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry = SaveAppEntry(localUserManager)
    )
}