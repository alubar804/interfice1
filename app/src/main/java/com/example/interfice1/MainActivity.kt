package com.example.interfice1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.Toolbar

import androidx.core.content.res.ResourcesCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val titulo = findViewById<TextView>(R.id.titulo)

        titulo.typeface = ResourcesCompat.getFont(this, R.font.courgetteregular)

        val tooolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(tooolbar)
        val jugador = findViewById(R.id.button2) as Button

        jugador.setOnClickListener{lanzarNewPlayer()}



    }

    private fun lanzarNewPlayer (){
        val i = Intent(this,NewPlayer::class.java)
        startActivity(i)
    }
    private fun lanzarGeneros (){
        val i = Intent(this,Generos::class.java)
        startActivity(i)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu1, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            (R.id.action_search) -> {return true}
            (R.id.action_add) -> {return true}
            (R.id.action_settings) ->{lanzarGeneros()
                return true}
            else -> {return super.onOptionsItemSelected(item)} }
    }



}