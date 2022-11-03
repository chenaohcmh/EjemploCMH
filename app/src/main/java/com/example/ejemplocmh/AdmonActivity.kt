package com.example.ejemplocmh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar


class AdmonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admon)
        setSupportActionBar(findViewById(R.id.My_toolbar_admon))


        supportFragmentManager.beginTransaction()
            .setReorderingAllowed(true)
            .add(
                R.id.fragment_container_view_admon,
                Prom_DiaFragment::class.java,
                null,
                "Solo por Hoy"
            )
            .commit()

    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_bar_admon1, menu)
        return super.onCreateOptionsMenu(menu)
    }

    /*override fun onOptionsItemSelected(item: MenuItem): Boolean = when(item.itemId) {
        R.id.itm_buscar -> {
            Toast.makeText(this, R.string.txt_buscar, Toast.LENGTH_LONG).show()
            true
        }

        R.id.itm_miCuenta -> {
            Toast.makeText(this, R.string.txt_miCuenta, Toast.LENGTH_LONG).show()
            true
        }

        R.id.itm_ConfCatalogo -> {
            Toast.makeText(this, R.string.txt_ConfCatalogo, Toast.LENGTH_LONG).show()
            true
        }

        R.id.itm_Catalogo -> {
            Toast.makeText(this, R.string.txt_VerCatalogo, Toast.LENGTH_LONG).show()
            true
        }

        R.id.itm_ConfigPromociones -> {
            Toast.makeText(this, R.string.txt_ConfigPromociones, Toast.LENGTH_LONG).show()
            true
        }

        R.id.itm_Promociones -> {
            Toast.makeText(this, R.string.txt_Promociones, Toast.LENGTH_LONG).show()
            true
        }

        R.id.itm_Version -> {
            Toast.makeText(this, R.string.txt_Version, Toast.LENGTH_LONG).show()
            true
        }

        R.id.itm_help -> {
            Toast.makeText(this, R.string.txt_ayuda, Toast.LENGTH_LONG).show()
            true
        }

        else -> {
            super.onOptionsItemSelected(item)
        }*/
    }




