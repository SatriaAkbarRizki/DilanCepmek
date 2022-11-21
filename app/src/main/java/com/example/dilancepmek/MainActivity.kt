package com.example.dilancepmek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        methodClick_Button()
    }

    fun methodClick_Button()
    {
        val button1 = findViewById<Button>(R.id.Btn1)
        val button2 = findViewById<Button>(R.id.Btn2)
        val button3 = findViewById<Button>(R.id.Btn3)

        button1.setOnClickListener{
            Toast.makeText(this@MainActivity,"Kamu Nanya?", Toast.LENGTH_SHORT).show()
        }

        button2.setOnClickListener {
            Toast.makeText(this@MainActivity, "Kamu Bertanya tanya", Toast.LENGTH_SHORT).show()
        }

        button3.setOnClickListener {
            Toast.makeText(this@MainActivity, "rawr", Toast.LENGTH_SHORT).show()
        }
    }

}