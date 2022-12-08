package com.example.myapplication

import kotlinx.coroutines.*
import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val chicken = Herbivores("Chicken", 20.0, "birds")
        val elephant = Herbivores("Elephant", 10000.0, "mammals")
        runBlocking {
            GlobalScope.launch(Dispatchers.IO) {
                delay(5000)
                println(elephant)
            }.join()
        }
        val wolf = Predator("Wolf", 300.0, "mammals")
        val cat = Predator("Cat", 30.0, "mammals")

        val list = listOf(chicken, wolf, cat)
        println(list) //Log.d
    }
}