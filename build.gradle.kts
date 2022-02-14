// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") apply false
    id("com.android.library") apply false
    id("org.jetbrains.kotlin.android") apply false
//    id("de.fayard.refreshVersions") apply false
}
buildscript {

}
tasks.register(name = "type", type = Delete::class) {
    delete(rootProject.buildDir)
}
