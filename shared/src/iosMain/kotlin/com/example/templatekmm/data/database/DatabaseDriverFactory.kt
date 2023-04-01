package com.example.templatekmm.data.database

import com.example.templatekmm.database.StoreDatabase
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver

actual class DatabaseDriverFactory {
    actual fun createDriver(): SqlDriver {
        return NativeSqliteDriver(StoreDatabase.Schema,"StoreDatabase.db")
    }
}
