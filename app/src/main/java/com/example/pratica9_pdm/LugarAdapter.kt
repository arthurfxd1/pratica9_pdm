package com.example.pratica9_pdm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LugarAdapter(
    private val lista: List<Lugar>,
    private val clique: (Lugar) -> Unit
) : RecyclerView.Adapter<LugarAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val img = view.findViewById<ImageView>(R.id.img_lugar)
        val nome = view.findViewById<TextView>(R.id.txt_nome_lugar)
        val desc = view.findViewById<TextView>(R.id.txt_desc_curta)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lugar, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val lugar = lista[position]
        holder.nome.text = lugar.nome
        holder.desc.text = lugar.descricao_curta
        holder.img.setImageResource(lugar.foto)
        holder.itemView.setOnClickListener { clique(lugar) }
    }

    override fun getItemCount() = lista.size
}
