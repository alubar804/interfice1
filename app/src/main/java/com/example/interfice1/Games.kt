package com.example.interfice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_games.*

class Games : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_games)
        val botonsico = findViewById<FloatingActionButton>(R.id.fab)
        botonsico.setOnClickListener{ acto() }
    }
    fun acto(){
        var palabras = ""
        val seleccionados = mutableListOf(String())
        var elarray = arrayListOf<CheckBox>(checkBox1,checkBox2,checkBox3,checkBox4)

        for (i in elarray){
            if (i.isChecked) {
                seleccionados.add(i.text.toString())
            }
        }
        var total=1
        for (j in seleccionados) {
            if (!palabras.equals("")) {
                if (total < seleccionados.size) {
                    palabras += " ,"
                } else {
                    palabras += " y "
                }
            }
            palabras += j
            total++
        }
        if (palabras.equals("")) {
            palabras = "No se ha seleccionado nada"
        }
        palabras += "."
        Toast.makeText(applicationContext,palabras, Toast.LENGTH_LONG).show()
    }
}//imagewiev+checkbutton>scroll