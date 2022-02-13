plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
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
        resources.excludes.add("META-INF/proguard/androidx-annotations.pro")
    }
}

dependencies {
//    implementation ("com.cxpublic:cxense-android:1.0.1") {
//        exclude(group= "com.android.support", module= "support-v4")
//    }
    implementation(Dependency.coreKTX)
    implementation("androidx.appcompat:appcompat:1.4.1")
    implementation("com.google.android.material:material:1.5.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
    //    Glid
    implementation("com.github.bumptech.glide:glide:4.13.0")
    kapt("com.github.bumptech.glide:compiler:4.13.0")
//    navigation
    implementation("androidx.navigation:navigation-fragment-ktx:2.4.1")
    implementation("androidx.navigation:navigation-ui-ktx:2.4.1")
//    paging
    implementation("androidx.paging:paging-runtime-ktx:3.1.0")
    testImplementation("androidx.paging:paging-common-ktx:3.1.0")
//    room
    implementation("androidx.room:room-runtime:2.4.1")
    kapt("androidx.room:room-compiler:2.4.1")
    implementation("androidx.room:room-ktx:2.4.1")
//    hilt
    implementation("com.google.dagger:hilt-android:2.40.5")
    kapt("com.google.dagger:hilt-compiler:2.40.5")
    implementation("androidx.hilt:hilt-navigation-fragment:1.0.0")
    implementation("androidx.hilt:hilt-work:1.0.0")
//    Lifecycle
    implementation("androidx.lifecycle:lifecycle-common:2.4.1")
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")
    // ViewModel
    val lifecycleVersion = "2.4.0"
    val archVersion = "2.1.0"
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion")
    // ViewModel utilities for Compose
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycleVersion")
    // LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion")
    // Lifecycles only (without ViewModel or LiveData)
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion")
    // Saved state module for ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycleVersion")
//    coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.0")
//    network
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.4")
    implementation("com.google.code.gson:gson:2.9.0")
}