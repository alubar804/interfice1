package com.example.interfice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
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
        var elarray = arrayListOf<CheckBox>(checkBox1,checkBox2,checkBox3,checkBox4)
        for (i in elarray){
            if (i++ == arrayString.length) {
                // end
            }
            if (!palabras.equals("")){
                palabras += " ,"
            }
            palabras += i.text.toString()
        }
        if (checkBox1.isChecked){
            palabras += checkBox1.text.toString().plus(" ")
        }
        if (checkBox2.isChecked){
            if (!palabras.equals("")){

            }
            palabras += checkBox2.text.toString().plus(" ")
        }
        if (checkBox3.isChecked){
            palabras += checkBox3.text.toString().plus(" ")
        }
        if (checkBox4.isChecked){
            palabras += checkBox4.text.toString().plus(" ")
        }
        if (palabras.equals("")){
            palabras="No se ha seleccionado nada"
        }else{

        }
    }
}//imagewiev+checkbutton>scroll