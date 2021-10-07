package com.example.interfice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_new_player.*

class NewPlayer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_player)
        val telefonos = arrayOf<Int>(111111111,222222222,333333333,44444444,555555555,666666666,777777777,888888888,999999999)

        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, telefonos)

        val list_telefonos = findViewById(R.id.spinner) as Spinner
        list_telefonos.adapter = adaptador
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        list_telefonos.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                var myStr = spinner.selectedItem.toString()
                Phone.setText(myStr)
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        })
    }
}