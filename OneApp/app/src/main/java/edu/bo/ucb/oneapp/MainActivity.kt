package edu.bo.ucb.oneapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
     private val button_red : Button
         get() = findViewById(R.id.btn_red)
     private val button_white : Button
        get() = findViewById(R.id.btn_white)
    private val layoutPrincipal : ConstraintLayout
        get() = findViewById(R.id.layoutPrincipal)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_red.setOnClickListener {
            layoutPrincipal.setBackgroundColor(Color.RED)
        }
        button_white.setOnClickListener {
            layoutPrincipal.setBackgroundColor(Color.WHITE)
        }
    }
}