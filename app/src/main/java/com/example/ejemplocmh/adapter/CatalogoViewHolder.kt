package com.example.reciclerview.adapter

import android.media.Image
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ejemplocmh.R

import com.example.reciclerview.Catalogo

class CatalogoViewHolder(view:View):RecyclerView.ViewHolder(view) {
    val prodname=view.findViewById<TextView>(R.id.tvprodname)
    val prodprice=view.findViewById<TextView>(R.id.tvprodprice)
    val foto=view.findViewById<ImageView>(R.id.ivprodimage)

    fun render(catalogomodel:Catalogo){
        prodname.text=catalogomodel.prodname
        prodprice.text=catalogomodel.prodprice
        Glide.with(foto.context).load(catalogomodel.foto).into(foto)

    }

}