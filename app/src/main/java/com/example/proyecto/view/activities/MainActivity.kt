package com.example.proyecto.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyecto.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO ESTABLECE LA BARRA DE HERRAMIENTAS COMO LA BARRA DE APP DE LA ACTIVIDAD
        setSupportActionBar(findViewById(R.id.my_toolbar))
    }
}
