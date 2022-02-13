// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id ("com.android.application") version "7.1.1" apply false
    id ("com.android.library") version "7.1.1" apply false
    id ("org.jetbrains.kotlin.android") version "1.6.10" apply false
}

//task clean(type: Delete) {
//    delete rootProject.buildDir
//}
tasks.register(name="type",type = Delete::class){
    delete(rootProject.buildDir)
}
