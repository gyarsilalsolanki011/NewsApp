package com.gyasrsilalsolabki011.newsapp.domain.usecases.app_entry

import com.gyasrsilalsolabki011.newsapp.domain.usecases.app_entry.ReadAppEntry
import com.gyasrsilalsolabki011.newsapp.domain.usecases.app_entry.SaveAppEntry

data class AppEntryUseCases(
    val readAppEntry: ReadAppEntry,
    val saveAppEntry: SaveAppEntry
)