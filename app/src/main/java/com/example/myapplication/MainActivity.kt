package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
/*
* Раздел 1. Практическое задание 1 «Работа с классами»
Шаг 1. Открыть среду разработки Android Studio+
Шаг 2. Создать новый проект+
Шаг 3. Создать классы для травоядных и плотоядных животных+
Шаг 4. Каждому присвоить некоторые уникальные поля+
Шаг 5. Поместить 2 травоядных и 2 плотоядных в список+
Шаг 6. Вывести список на экран+
Шаг 7. Загрузить исходный код в репозиторий на платформе GitHub
Шаг 8. Выложить ссылку в Odin

*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val chicken = Herbivores("Chicken", 20.0, "birds")
        val elephant = Herbivores("Elephant", 10000.0, "mammals")
        val wolf = Predator("Wolf", 300.0, "mammals")
        val cat = Predator("Cat", 30.0, "mammals")

        val list = listOf(chicken, elephant, wolf, cat)
        println(list) //Log.d
    }
}