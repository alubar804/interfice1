package com.example.interfice1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val titulo = findViewById<TextView>(R.id.titulo)

        titulo.typeface = ResourcesCompat.getFont(this, R.font.courgetteregular)

        val jugador = findViewById(R.id.button2) as Button

        jugador.setOnClickListener{lanzarNewPlayer()}

    }

    private fun lanzarNewPlayer (){
        val i = Intent(this,NewPlayer::class.java)
        startActivity(i)
    }

}