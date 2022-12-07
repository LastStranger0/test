package com.example.myapplication

class Tree(
    name: String,
    size: Int,
    private val treeType: String
): Plant(name, size) {
    private fun getType(){
        println(treeType)
    }
}