package com.example.templatekmm.data.database

import android.content.Context
import com.example.templatekmm.database.StoreDatabase
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver

actual class DatabaseDriverFactory(private val context: Context) {

    actual fun createDriver(): SqlDriver {
        return AndroidSqliteDriver(StoreDatabase.Schema, context, "StoreDatabase.db")
    }
}