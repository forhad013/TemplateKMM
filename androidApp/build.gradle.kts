plugins {
    id(BuildPlugins.ANDROID_APPLICATION)
    kotlin(BuildPlugins.ANDROID)
}

android {
    namespace = AppConfig.ANDROID_NAMESPACE
    compileSdk = AppConfig.compileSdk
    defaultConfig {
        applicationId = AppConfig.APPLICATION_ID
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = BuildDependencyVersions.KOTLIN_COMPILER_EXTENSION_VERSION
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(BuildModules.SHARED_MODULE))
    addDependenciesForCompose()
}