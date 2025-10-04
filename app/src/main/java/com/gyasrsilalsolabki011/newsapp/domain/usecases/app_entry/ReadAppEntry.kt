package com.gyasrsilalsolabki011.newsapp.domain.usecases.app_entry

import com.gyasrsilalsolabki011.newsapp.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry (
    private val localUserManager: LocalUserManager
) {
    operator fun invoke(): Flow<Boolean> {
        return localUserManager.readAppEntry()
    }
}