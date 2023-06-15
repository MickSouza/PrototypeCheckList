package com.example.prototypechecklist.ui.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.prototypechecklist.R
import com.example.prototypechecklist.dao.ProdutosDao
import com.example.prototypechecklist.model.Cadastro
import com.example.prototypechecklist.ui.recycleview.adapter.ListaCadastroAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class RelatorioActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "Bem Vindo(a) ao APP Check List! ;)", Toast.LENGTH_SHORT).show()
        val recyclerView = findViewById<RecyclerView>(R.id.recycleView)
        val dao = ProdutosDao()
        recyclerView.adapter = ListaCadastroAdapter(context = this, cadastros = dao.findAll())
        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener {
            val intent = Intent(this, FormularioActivity::class.java)
            startActivity(intent)
        }
    }
}