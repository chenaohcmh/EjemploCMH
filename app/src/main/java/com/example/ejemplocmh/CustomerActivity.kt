package com.example.ejemplocmh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.reciclerview.CatalogoProveer
import com.example.reciclerview.adapter.CatalogoAdapter
import com.google.android.material.snackbar.Snackbar

class CustomerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer)
        setSupportActionBar(findViewById(R.id.My_toolbar))

        iniciorecycler()

        val fab:View=findViewById(R.id.fab46)
        fab.setOnClickListener{ View->
            Snackbar.make(View,"Práctica de action floating button",Snackbar.LENGTH_LONG).show()
            val llamado= Intent(this,MainActivity::class.java)
            startActivity(llamado)
        }
    }
    fun iniciorecycler(){
        val recyclerView=findViewById<RecyclerView>(R.id.recyclercatalogo)
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.adapter=CatalogoAdapter(CatalogoProveer.catalogolists)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_bar, menu)
        return super.onCreateOptionsMenu(menu)


    }






/*
    override fun onOptionsItemSelected(item: MenuItem): Boolean = when(item.itemId){
        R.id.itm_buscar -> {
            Toast.makeText(this, R.string.txt_buscar, Toast .LENGTH_LONG).show()
            true
        }
        R.id.itm_help -> {
            Toast.makeText(this, R.string.txt_ayuda, Toast.LENGTH_LONG).show()
            true
        }


        R.id.itm_miCuenta -> {
            Toast.makeText(this, R.string.txt_miCuenta, Toast.LENGTH_LONG).show()
            true
        }

        R.id.itm_Promociones -> {
            Toast.makeText(this, R.string.txt_Promociones, Toast.LENGTH_LONG).show()
            true
        }

        R.id.itm_contactar -> {
            Toast.makeText(this, R.string.txt_contactar, Toast.LENGTH_LONG).show()
            true
        }

        R.id.itm_enviar -> {
            Toast.makeText(this, R.string.txt_enviar, Toast.LENGTH_LONG).show()
            true
        }


        else -> {
            super.onOptionsItemSelected(item)
        }
    }
*/

}