plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
//    id("de.fayard.refreshVersions")
//    id ("androidx.navigation.safeargs.kotlin")
//    id ("dagger.hilt.android.plugin")
//    id ("kotlin-parcelize")
}

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "com.example.rickyandmorty"
        minSdk = 21
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        getByName("debug") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    packagingOptions {
        resources.excludes.add("META-INF/*")
        /*
        resources.excludes.add("META-INF/proguard/androidx-annotations.pro")
        resources.excludes.add("META-INF/DEPENDENCIES")
        resources.excludes.add("META-INF/NOTICE")
        resources.excludes.add("META-INF/LICENSE")
        resources.excludes.add("META-INF/LICENSE.txt")
        resources.excludes.add("META-INF/NOTICE.txt")*/
    }

}

dependencies {
//    implementation ("com.cxpublic:cxense-android:_") {
//        exclude(group= "com.android.support", module= "support-v4")
//    }
    implementation("androidx.core:core-ktx:1.7.0")
    implementation(AndroidX.appCompat)
    implementation(Google.android.material)
    implementation(AndroidX.constraintLayout)
    testImplementation(Testing.junit4)
    androidTestImplementation(AndroidX.test.ext.junit)
    androidTestImplementation(AndroidX.test.espresso.core)
    //    Glid
    implementation("com.github.bumptech.glide:glide:_")
    kapt("com.github.bumptech.glide:compiler:_")
//    navigation
    implementation(AndroidX.navigation.fragmentKtx)
    implementation(AndroidX.navigation.uiKtx)
//    paging
    implementation(AndroidX.paging.runtimeKtx)
    testImplementation(AndroidX.paging.commonKtx)
//    room
    implementation(AndroidX.room.runtime)
    kapt(AndroidX.room.compiler)
    implementation(AndroidX.room.ktx)
//    hilt
    implementation(Google.dagger.hilt.android)
    kapt(Google.dagger.hilt.compiler)
    implementation(AndroidX.hilt.navigationFragment)
    implementation(AndroidX.hilt.work)
//    Lifecycle
    implementation(AndroidX.lifecycle.common)
    implementation(AndroidX.lifecycle.extensions)
    // ViewModel
    val lifecycleVersion = "2.4.0"
    val archVersion = "2.1.0"
    implementation(AndroidX.lifecycle.viewModelKtx)
    // ViewModel utilities for Compose
    implementation(AndroidX.lifecycle.viewModelCompose)
    // LiveData
    implementation(AndroidX.lifecycle.liveDataKtx)
    // Lifecycles only (without ViewModel or LiveData)
    implementation(AndroidX.lifecycle.runtimeKtx)
    // Saved state module for ViewModel
    implementation(AndroidX.lifecycle.viewModelSavedState)
//    coroutines
    implementation(KotlinX.coroutines.core)
    implementation(KotlinX.coroutines.android)
//    network
    implementation(Square.retrofit2)
    implementation(Square.retrofit2.converter.gson)
    implementation(Square.okHttp3.loggingInterceptor)
    implementation("com.google.code.gson:gson:_")
//refreshVersions
    implementation("org.springframework:spring-web:5.+")
}