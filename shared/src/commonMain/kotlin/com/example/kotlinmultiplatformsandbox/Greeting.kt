package com.example.kotlinmultiplatformsandbox

import kotlin.random.Random

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return if (Random.nextBoolean()) "Hi!" else "Hello!" +
            "\nGuess what it is! > ${platform.name.reversed()}!"
    }
}