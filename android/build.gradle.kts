plugins {
    id("org.jetbrains.compose") version "0.4.0-build177"
    id("com.android.application")
    kotlin("android")
}

group = "me.katz"
version = "1.0"

repositories {
    google()
}

dependencies {
    implementation(project(":common"))
    implementation("androidx.activity:activity-compose:1.3.0-alpha07")
    implementation("com.arkivanov.decompose:decompose:0.2.3")
    implementation("com.arkivanov.decompose:extensions-compose-jetpack:0.2.3")
}

android {
    compileSdkVersion(29)
    defaultConfig {
        applicationId = "me.katz.android"
        minSdkVersion(24)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}