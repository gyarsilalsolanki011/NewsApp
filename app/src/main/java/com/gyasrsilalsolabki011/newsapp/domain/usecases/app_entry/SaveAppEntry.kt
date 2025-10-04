package com.gyasrsilalsolabki011.newsapp.domain.usecases.app_entry

import com.gyasrsilalsolabki011.newsapp.domain.manager.LocalUserManager

class SaveAppEntry(
    private val localUserManager: LocalUserManager
) {
    suspend operator fun invoke() {
        localUserManager.saveAppEntry()
    }
}