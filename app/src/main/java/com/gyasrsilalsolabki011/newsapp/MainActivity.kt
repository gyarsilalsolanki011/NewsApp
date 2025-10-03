package com.gyasrsilalsolabki011.newsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat
import com.gyasrsilalsolabki011.newsapp.ui.onboarding.OnBoardingScreen
import com.gyasrsilalsolabki011.newsapp.ui.screens.home.HomeScreen
import com.gyasrsilalsolabki011.newsapp.ui.theme.NewsAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        // installSplashScreen()
        setContent {
            NewsAppTheme(
                dynamicColor = false
            ) {
                Box(modifier = Modifier.background(MaterialTheme.colorScheme.background)) {
                    var showOnboarding by remember { mutableStateOf(true) }

                    if (showOnboarding) {
                        OnBoardingScreen(onFinished = {
                            showOnboarding = false
                        })
                    } else {
                        HomeScreen()
                    }
                }
            }
        }
    }
}
