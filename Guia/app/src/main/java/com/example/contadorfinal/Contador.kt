package com.example.contadorfinal

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.compose.ui.text.style.TextOverflow

class Contador : ComponentActivity() {
    private var conta =0
    private lateinit var contaTextview : TextView
    private lateinit var contaButton : Button
    private lateinit var restartButton: Button


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contador)

        contaTextview = findViewById(R.id.txtCounter)
        contaButton = findViewById(R.id.btnCounter)
        restartButton=findViewById(R.id.btnRestart)
        val title = getString(R.string.title_login)

        contaButton.setOnClickListener{
            conta ++
            contaTextview.text= "Estado de contador: $conta"
        }

        restartButton.setOnClickListener {
            conta=0
            contaTextview.text="Estado de contador: $conta"
        }
    }
}