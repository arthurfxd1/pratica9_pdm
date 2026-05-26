package com.example.pratica9_pdm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PontoAdapter(private val lista: List<PontoTuristico>) : 
    RecyclerView.Adapter<PontoAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nome = view.findViewById<TextView>(R.id.txt_nome_ponto)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_ponto, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nome.text = lista[position].nome
    }

    override fun getItemCount() = lista.size
}
