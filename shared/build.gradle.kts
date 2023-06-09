plugins {
    id(BuildPlugins.ANDROID_LIBRARY)
    kotlin(BuildPlugins.MULTIPLATFORM)
    kotlin(BuildPlugins.KOTLIN_PLUGIN_SERIALIZATION) version BuildDependencyVersions.KOTLIN_PLUGIN_SERIALIZATION_VERSION
    id(BuildPlugins.SQL_DELIGHT)
}

kotlin {
    android {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = BuildModules.SHARED_MODULE
        }
    }

    val coroutinesVersion = "1.6.4"
    val ktorVersion = "2.2.1"
    val sqlDelightVersion = "1.5.5"
    val dateTimeVersion = "0.4.0"

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(AppDependencies.KOTLIN_COROUTINS_CORE)
                implementation(AppDependencies.KTOR_CLIENT_CORE)
                implementation(AppDependencies.KTOR_CLIENT)
                implementation(AppDependencies.KTOR_SERIALIZATION)
                implementation(AppDependencies.SQL_DELIGHT_RUNTIME)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val androidMain by getting {
            dependencies {
                implementation(AppDependencies.ANDROID_KTOR_CLIENT)
                implementation(AppDependencies.ANDROID_SQL_DELIGHT_DRIVE)
            }
        }
        val androidUnitTest by getting
        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by creating {

            dependencies {
                implementation(AppDependencies.IOS_KTOR_CLIENT)
                implementation(AppDependencies.IOS_SQL_DELIGHT_DRIVE)
            }
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
        }
        val iosX64Test by getting
        val iosArm64Test by getting
        val iosSimulatorArm64Test by getting
        val iosTest by creating {
            dependsOn(commonTest)
            iosX64Test.dependsOn(this)
            iosArm64Test.dependsOn(this)
            iosSimulatorArm64Test.dependsOn(this)
        }
    }
}

android {
    namespace = AppConfig.ANDROID_NAMESPACE
    compileSdk = AppConfig.compileSdk
    defaultConfig {
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
    }
}