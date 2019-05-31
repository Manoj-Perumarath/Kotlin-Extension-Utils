package com.manoj.kotlinxtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.manoj.kotlin_extended.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toast("Hey from library")
    }
}
