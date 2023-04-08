package com.example.templatekmm.di

import com.example.templatekmm.Greeting
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.GlobalContext.startKoin

class GreetingHelper : KoinComponent {
    private val greeting : Greeting by inject()
    fun greet() : String = greeting.greet()
}

fun initKoin(){
    startKoin {
        modules(platformModule())
    }
}