
plugins {
    id("com.android.application") version "8.6.1"
    id("org.jetbrains.kotlin.android") version "2.0.21"
}

android {
    namespace = "br.com.ludofitness"
    compileSdk = 35

    defaultConfig {
        applicationId = "br.com.ludofitness"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
