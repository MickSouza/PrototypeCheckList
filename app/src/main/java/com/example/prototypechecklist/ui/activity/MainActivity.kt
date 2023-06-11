package com.example.prototypechecklist.ui.activity

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.prototypechecklist.R
import com.example.prototypechecklist.model.Cadastro
import com.example.prototypechecklist.ui.recycleview.adapter.ListaCadastroAdapter

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "Bem Vindo(a) ao APP Check List! ;)", Toast.LENGTH_SHORT).show()
     val recyclerView = findViewById<RecyclerView>(R.id.recycleView)
        recyclerView.adapter = ListaCadastroAdapter(context = this, cadastros = listOf(
            Cadastro(placa = "CBR5537", modeloBase = "Honda Civic", uf = "SP", loja = "Santo Amaro", tipoDeServivo = "Instalar", tipoDeFiscalizacao = "Olho",
            instalador = "Bruno", tipoKit1 = "1234545", pocSag1 = "12.22.2.55", tipoKit2 = "36455", pocSag2 = "12.22.4555"),
            Cadastro(placa = "RCO5578", modeloBase = "Honda Civic", uf = "SP", loja = "Santo Amaro", tipoDeServivo = "Instalar", tipoDeFiscalizacao = "Olho",
                instalador = "Fram", tipoKit1 = "1234545", pocSag1 = "12.22.2.55", tipoKit2 = "36455", pocSag2 = "12.22.4555"),
            Cadastro(placa = "DEU8837", modeloBase = "Honda Civic", uf = "SP", loja = "Santo Amaro", tipoDeServivo = "Instalar", tipoDeFiscalizacao = "Olho",
                instalador = "Bruno", tipoKit1 = "1234545", pocSag1 = "12.22.2.55", tipoKit2 = "36455", pocSag2 = "12.22.4555"),

        ))
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}