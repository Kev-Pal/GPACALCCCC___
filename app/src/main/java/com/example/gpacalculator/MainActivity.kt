package com.example.gpacalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintSet.Layout


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "CalculatorApp"

        val Course = findViewById(R.id.editTextNumber) as EditText
        val Course2 = findViewById(R.id.editTextNumber2) as EditText
        val Course3 = findViewById(R.id.editTextNumber3) as EditText
        val Course4= findViewById(R.id.editTextNumber4) as EditText
        val Course5= findViewById(R.id.editTextNumber5) as EditText
        val total = findViewById(R.id.editText2) as EditText
        val but = findViewById(R.id.button) as Button

        but.setOnClickListener{


            val grade = Course.text.toString().toInt()
            val grade2 = Course2.text.toString().toInt()
            val grade3 = Course3.text.toString().toInt()
            val grade4 = Course4.text.toString().toInt()
            val grade5 = Course5.text.toString().toInt()

            val average = ((grade + grade2 + grade3 + grade4 + grade5)/5)

            if(average <= 60)
            {
                layout.setBackgroundColor(Color red)
                total.setText(average.toString())
            }
            if(average >= 61 && average < 80)
            {
                layout.setBackgroundColor(Color yellow)
                total.setText(average.toString())
            }

            if(average > 80 && average <= 100)
            {
                layout.setBackgroundColor(Color green)
                total.setText(average.toString())
            }
            else
            total.setText("Your GPA does not fall under any category")







        }
    }
}