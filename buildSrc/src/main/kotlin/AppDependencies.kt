object AppDependencies {

    const val  COMPOSE_UI = "androidx.compose.ui:ui:${BuildDependencyVersions.COMPOSE_VERSION}"
    const val  COMPOSE_UI_TOOLING = "androidx.compose.ui:ui-tooling:${BuildDependencyVersions.COMPOSE_VERSION}"
    const val  COMPOSE_UI_TOOLING_PREVIEW = "androidx.compose.ui:ui-tooling-preview:${BuildDependencyVersions.COMPOSE_VERSION}"
    const val  COMPOSE_FOUNDATION = "androidx.compose.foundation:foundation:${BuildDependencyVersions.COMPOSE_VERSION}"
    const val  COMPOSE_MATERIAL = "androidx.compose.material:material:${BuildDependencyVersions.COMPOSE_VERSION}"
    const val  COMPOSE_ACTIVITY = "androidx.activity:activity-compose:${BuildDependencyVersions.COMPOSE_ACTIVITY_VERSION}"

    //KTOR
    const val KTOR_CLIENT_CORE =  "io.ktor:ktor-client-core:${BuildDependencyVersions.KTOR_VERSION}"
    const val KTOR_CLIENT = "io.ktor:ktor-client-content-negotiation:${BuildDependencyVersions.KTOR_VERSION}"
    const val KTOR_SERIALIZATION = "io.ktor:ktor-serialization-kotlinx-json:${BuildDependencyVersions.KTOR_VERSION}"


    //Android specific
    const val ANDROID_KTOR_CLIENT = "io.ktor:ktor-client-android:${BuildDependencyVersions.KTOR_VERSION}"
    const val ANDROID_SQL_DELIGHT_DRIVE = "com.squareup.sqldelight:android-driver:${BuildDependencyVersions.SQL_DELIGHT_VERSION}"

    //iOS specific
    const val IOS_KTOR_CLIENT = "io.ktor:ktor-client-darwin:${BuildDependencyVersions.KTOR_VERSION}"
    const val IOS_SQL_DELIGHT_DRIVE = "com.squareup.sqldelight:native-driver:${BuildDependencyVersions.SQL_DELIGHT_VERSION}"

    //
    const val KOTLIN_COROUTINS_CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${BuildDependencyVersions.COROUTINES_VERSION}"
    const val SQL_DELIGHT_RUNTIME = "com.squareup.sqldelight:runtime:${BuildDependencyVersions.SQL_DELIGHT_VERSION}"

}