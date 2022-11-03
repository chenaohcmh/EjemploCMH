package com.example.reciclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ejemplocmh.R

import com.example.reciclerview.Catalogo

class CatalogoAdapter(private val catalogolist:List<Catalogo>):RecyclerView.Adapter<CatalogoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatalogoViewHolder {
        var layoutInflater=LayoutInflater.from(parent.context)

        return CatalogoViewHolder(layoutInflater.inflate(R.layout.item_catalogo,parent,false))
    }

    override fun onBindViewHolder(holder: CatalogoViewHolder, position: Int) {

        val item=catalogolist[position]
        holder.render(item)

    }

    override fun getItemCount(): Int {
        return catalogolist.size

    }


}