package com.example.interfice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_preferences.*

class Preferences : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preferences)
        var option = "[N/A]\n"
        var rating = "[N/A]\n"
        var estrellas = "[N/A]\n"

        val rGroup = findViewById<RadioGroup>(R.id.radioGroup)

        rGroup.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener{

            override fun onCheckedChanged(group: RadioGroup, checkedId: Int) {
                val checkedRadioButton = rGroup.findViewById<RadioButton>(checkedId).text.toString()
                 option = " La preferencia de genero es : $checkedRadioButton\n"
                textViewPreference.text = option + rating +estrellas
            }
        })
        val seekB= findViewById<SeekBar>(R.id.seekBar)
        seekB.setOnSeekBarChangeListener(object:SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                // Display the current progress of SeekBar
                rating = " El progreso es igual a: $i\n"
                textViewPreference.text = option + rating +estrellas

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                Toast.makeText(applicationContext,"start tracking",Toast.LENGTH_SHORT).show()
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                Toast.makeText(applicationContext,"stop tracking",Toast.LENGTH_SHORT).show()
            }


        })
        val estela = findViewById<RatingBar>(R.id.ratingBar)
        estela.setOnRatingBarChangeListener( object : RatingBar.OnRatingBarChangeListener{
            override fun onRatingChanged(p0: RatingBar?, p1: Float, p2: Boolean) {
                estrellas = " El rating es igual a: $p1\n"
                textViewPreference.text = option + rating +estrellas
            }
        })



    }
}