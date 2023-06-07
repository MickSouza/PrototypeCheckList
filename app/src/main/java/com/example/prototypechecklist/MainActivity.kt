package com.example.prototypechecklist

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "Bem Vindo(a) ao APP Check List! ;)", Toast.LENGTH_SHORT).show()
        setContentView(R.layout.activity_main)
    }
}