package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("passed")

        val btnOk = findViewById<Button>(R.id.button) // R stands for resources, then Id, the items ID
        val textThing = findViewById<TextView>(R.id.textView)

        var counter = 0

        btnOk.setOnClickListener {
            counter++
            textThing.text = counter.toString()
        }
    }
}