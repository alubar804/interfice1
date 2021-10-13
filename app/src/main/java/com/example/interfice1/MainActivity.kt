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

        val tooolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(tooolbar)
        val jugar = findViewById<Button>(R.id.button1)
        jugar.setOnClickListener{lanzarGames()}

        val jugador = findViewById<Button>(R.id.button2)
        jugador.setOnClickListener{lanzarNewPlayer()}

        val prefer = findViewById<Button>(R.id.button3)
        prefer.setOnClickListener{lanzarPreferences()}

        val about = findViewById<Button>(R.id.button4)
        about.setOnClickListener{lanzarAbout()}


    }

    private fun lanzarNewPlayer (){
        val i = Intent(this,NewPlayer::class.java)
        startActivity(i)
    }
    private fun lanzarGeneros (){
        val i = Intent(this,Generos::class.java)
        startActivity(i)
    }
    private fun lanzarGames (){
        val i = Intent(this,Games::class.java)
        startActivity(i)
    }
    private fun lanzarPreferences (){
        val i = Intent(this,Preferences::class.java)
        startActivity(i)
    }
    private fun lanzarAbout(){
        val i = Intent(this,About::class.java)
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