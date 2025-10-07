package com.gyasrsilalsolabki011.newsapp.di

import android.app.Application
import androidx.room.Room
import com.gyasrsilalsolabki011.newsapp.data.local.NewsDao
import com.gyasrsilalsolabki011.newsapp.data.local.NewsDatabase
import com.gyasrsilalsolabki011.newsapp.data.local.NewsTypeConvertor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jakarta.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideNewsDatabase(
        application: Application
    ): NewsDatabase {
        return Room.databaseBuilder(
            context = application,
            klass = NewsDatabase::class.java,
            name = "news_db"
        ).addTypeConverter(NewsTypeConvertor())
            .fallbackToDestructiveMigration(false)
            .build()
    }

    @Provides
    @Singleton
    fun provideNewsDao(
        newsDatabase: NewsDatabase
    ): NewsDao = newsDatabase.newsDao
}