package com.example.prototypechecklist.dao

import com.example.prototypechecklist.model.Cadastro

class ProdutosDao {

    fun add(produto: Cadastro){
         produtos.add(produto)
    }
    fun findAll() : List<Cadastro>{
        return produtos.toList()
    }

    companion object {
        private val produtos = mutableListOf<Cadastro>()
    }
}