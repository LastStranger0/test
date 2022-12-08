package com.example.myapplication

class Herbivores(
    val name: String,
    val size: Double,
    val kind: String
) {
    fun printName(){
        println(name)
    }

    fun eatSmth(eat: String){
        println("$name ate $eat")
    }
}