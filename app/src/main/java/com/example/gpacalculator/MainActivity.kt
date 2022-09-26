package com.example.gpacalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var editText: EditText
    lateinit var string: String
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "CalculatorApp"
        button = findViewById(R.id.button)
        editText = findViewById(R.id.editText)
        textView = findViewById(R.id.textView)
        button.setOnClickListener{
            string = editText.text.toString()
            textView.text = string
        }
    }
}