package com.example.colordescriptor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Spinner
import android.widget.TextView
import androidx.core.view.get

class MainActivity() : AppCompatActivity() {

    private lateinit var spinnerColors: Spinner
    private lateinit var textViewDescriptionTemp: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spinnerColors = findViewById(R.id.spinnerColors)
        textViewDescriptionTemp = findViewById(R.id.textViewDscriptionTemp)
    }

    fun showDescription(view: View) {
        val position : Int = spinnerColors.selectedItemPosition
        val description : String = getDescriptionByPosition(position)
        textViewDescriptionTemp.text = description
    }

    private fun getDescriptionByPosition (position : Int): String {
        val descriptions : List<String> = resources.getStringArray(R.array.description_of_temp).toList()
        return descriptions[position]
    }
}