package com.gyasrsilalsolabki011.newsapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.gyasrsilalsolabki011.newsapp.domain.models.Article

@Database(entities = [Article::class],version = 2,)
@TypeConverters(NewsTypeConvertor::class)
abstract class NewsDatabase : RoomDatabase() {

    abstract val newsDao: NewsDao

}