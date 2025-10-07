plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    id("com.google.dagger.hilt.android") version "2.57.2" apply false
    id("com.google.devtools.ksp") version "2.2.20-2.0.3" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.2.20" apply false
    id ("org.jetbrains.kotlin.plugin.serialization") version "2.2.20"
}
