package com.example.interfice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_preferences.*
class Preferences : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preferences)
        var option = "no se ha pulsado ninguna opcion"
        var rating = "no hay rating aun"
        var estrellas = "no hay estrellas aun"

        val rGroup = findViewById(R.id.radioGroup) as RadioGroup

        rGroup.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener{

            override fun onCheckedChanged(group: RadioGroup, checkedId: Int) {
                val checkedRadioButton = rGroup.findViewById<RadioButton>(checkedId).text.toString()
                 option = " La preferencia de genero es : $checkedRadioButton"
                textViewPreference.text = option + rating +estrellas
            }
        })
        val seekB= findViewById(R.id.seekBar) as SeekBar

        seekB.setOnSeekBarChangeListener(  :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                TODO("preguntar")
                val seekerValor = seekB.progress.toString()
                rating = " El progreso es igual a: $seekerValor"
                textViewPreference.text = option + rating +estrellas
            }
        })
    }
}