package com.example.contador1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Contador : AppCompatActivity() {
    private var conta =0
    private lateinit var btnCont : Button
    private lateinit var  txtCont: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contador)

        btnCont = findViewById(R.id.btnConta)
        txtCont = findViewById(R.id.txtConta)

        btnCont.setOnClickListener{
            conta++
            txtCont.text = conta.toString()
    }

}
}
