package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    //Пользователь запускает активность и начинает работать с ней
    //Пользователь запускает активность, работает с ней, а потом, переключается на другую
    //Пользователь запускает активность, поворачивает телефон
    //Пользователь запускает активность. поворачивает телефон, переключается на другую активность и возвращается обратно
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(MainActivity::class.simpleName, "onCreate")
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        Log.d(MainActivity::class.simpleName, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MainActivity::class.simpleName, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(MainActivity::class.simpleName, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(MainActivity::class.simpleName, "onStop")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d(MainActivity::class.simpleName, "onRestart")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(MainActivity::class.simpleName, "onSavedInstanceState")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MainActivity::class.simpleName, "onDestroy")
    }
}