package com.example.pratica9_pdm

import java.io.Serializable

data class Lugar(
    val nome: String,
    val foto: Int,
    val descricao_curta: String,
    val descricao_longa: String,
    val pontos: List<PontoTuristico>
) : Serializable

data class PontoTuristico(
    val nome: String
) : Serializable
