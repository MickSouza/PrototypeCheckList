package com.example.prototypechecklist.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.example.prototypechecklist.R

class FormularioActivity : AppCompatActivity(R.layout.activity_formulario) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val placa = findViewById<EditText>(R.id.placa)
        val salvar = findViewById<Button>(R.id.salvar)
        salvar.setOnClickListener {
            val placaTexto = placa.text.toString()
            Log.i("From",  "Oncreate: $placaTexto")
        }


    }

}