package com.example.pratica9_pdm

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DetalheActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe)

        val lugar = intent.getSerializableExtra("lugar") as Lugar

        val img = findViewById<ImageView>(R.id.img_detalhe)
        val nome = findViewById<TextView>(R.id.txt_nome_detalhe)
        val desc = findViewById<TextView>(R.id.txt_desc_longa)
        val rv = findViewById<RecyclerView>(R.id.rv_pontos)

        img.setImageResource(lugar.foto)
        nome.text = lugar.nome
        desc.text = lugar.descricao_longa

        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = PontoAdapter(lugar.pontos)
    }
}
