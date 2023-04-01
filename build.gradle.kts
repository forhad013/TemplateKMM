plugins {
    //trick: for the same plugin versions in all sub-modules

    id(BuildPlugins.ANDROID_APPLICATION).version(BuildDependencyVersions.ANDROID_APP_LIBRARY_VERSION).apply(false)
    id(BuildPlugins.ANDROID_LIBRARY).version(BuildDependencyVersions.ANDROID_APP_LIBRARY_VERSION).apply(false)
    kotlin(BuildPlugins.ANDROID).version(BuildDependencyVersions.ANDROID_MULTIPLATFORM_VERSION).apply(false)
    kotlin(BuildPlugins.MULTIPLATFORM).version(BuildDependencyVersions.ANDROID_MULTIPLATFORM_VERSION).apply(false)

}

buildscript {
    val sqlDelightVersion = "1.5.5"

    dependencies {
        classpath("com.squareup.sqldelight:gradle-plugin:$sqlDelightVersion")
    }

}


tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}


