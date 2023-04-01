package com.example.templatekmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform