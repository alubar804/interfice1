package com.example.interfice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class Generos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generos)
        val bottomAppBar = findViewById(R.id.bottom_appbar) as BottomAppBar
        bottomAppBar.replaceMenu(R.menu.menu1)

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {
            Snackbar.make(it,"Desplazamiento",Snackbar.LENGTH_LONG).show()
        }
        val items = ArrayList<Textoides>()
        items.add(Textoides(R.string.accion))
        items.add(Textoides(R.string.aventura))
        items.add(Textoides(R.string.fantasia))
        items.add(Textoides(R.string.ciencia_ficcion))
        items.add(Textoides(R.string.plataformas))

        val recView = findViewById<RecyclerView>(R.id.recyclerView)

        recView.setHasFixedSize(true)

        val adaptador = TextAdapter(items)
        recView.adapter = adaptador
        recView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        adaptador.onClick = {
            Toast.makeText(this, ""+ resources.getString(items[recView.getChildAdapterPosition(it)].cadena), Toast.LENGTH_LONG).show()
        }
    }
}