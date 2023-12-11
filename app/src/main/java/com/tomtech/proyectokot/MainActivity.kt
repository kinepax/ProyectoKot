package com.tomtech.proyectokot

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Encuentra la AppCompatTextView con el id txtName
        val eName = findViewById<AppCompatTextView>(R.id.txtName)

        // Ahora puedes utilizar eName como referencia a tu TextView
        // Por ejemplo, para establecer un texto
        eName.text = "Hola, mundo!"
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity","onStart")
    }

    override fun onResume() {
        super.onResume();
        Log.d("MainActivity","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity","onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity","onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity","onDestroy")
    }
}