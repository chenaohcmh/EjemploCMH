package com.example.ejemplocmh

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ConfPromoFragment: Fragment(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView (
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?{
        val fragmento =inflater.inflate(R.layout.fragment_conf_prom,container,false)

        //var tarea=requireArguments().getString("tarea")
        //var txtviewtarea:TextView=fragmento.findViewById(R.id.editTextTextPersonName4)
        //txtviewtarea.text=tarea




        return fragmento
    }


}