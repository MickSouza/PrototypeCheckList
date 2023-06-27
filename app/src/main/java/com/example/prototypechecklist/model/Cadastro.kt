package com.example.prototypechecklist.model

data class Cadastro(
    val placa: String,
    val modeloBase: String,
    val uf: String,
    val loja: String,
    val tipoDeServivo: String,
    val tipoDeFiscalizacao: String,
    val instalador: String,
    val tipoKit1: String,
    val pocSag1: String,
    val tipoKit2: String,
    val pocSag2: String,
    val odometro: String,
    val img1: String? = null
        )



