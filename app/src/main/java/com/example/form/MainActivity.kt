package com.example.form

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val spinner = findViewById<Spinner>(R.id.genderSpinner)
        val elements = arrayOf("Male", "Female")
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, elements)
        spinner.adapter = adapter
    }
}
