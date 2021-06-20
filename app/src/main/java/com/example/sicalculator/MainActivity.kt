package com.example.sicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.amt)
        val num2 = findViewById<EditText>(R.id.interest)
        val num3 = findViewById<EditText>(R.id.time)
        val b1   = findViewById<Button>(R.id.btn)
        val ans  = findViewById<TextView>(R.id.op)
        val b2   = findViewById<Button>(R.id.bttn)


        b1.setOnClickListener {
            val p = num1.text.toString().toInt()
            val r = num2.text.toString().toInt()
            val t = num3.text.toString().toFloat()
            val f = (p*r*t)/100
            ans.text = f.toString()

        }

        //Refresh button code
        b2.setOnClickListener {
            num1.setText("")
            num2.setText("")
            num3.setText("")
             ans.setText("")
        }

    }
}