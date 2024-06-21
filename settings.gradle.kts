pluginManagement {
    repositories {
        mavenCentral()
        google()
    }
    includeBuild("plugin")
}

plugins {
    id("com.example.my.sample.ecosystem")
    id("com.example.my.android.ecosystem")
}

rootProject.name = "software-type-custom-lifecycle"

include("usage-sample")
include("usage-android-library")