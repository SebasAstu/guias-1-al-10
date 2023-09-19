package edu.bo.ucb.oneapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MenuPrincipal : AppCompatActivity() {
    private val txtSeleccionado :TextView
        get() = findViewById(R.id.txt_seleccionado)
    private val btnServicios: Button
        get() = findViewById(R.id.btn_servicios)
    private val btnPortafolio: Button
        get() = findViewById(R.id.btn_Portafolio)
    private val btnAcerca: Button
        get() = findViewById(R.id.btn_Acerca)
    private val btnContacto: Button
        get() = findViewById(R.id.btn_contacto)
    private val btnRedes: Button
        get() = findViewById(R.id.btn_redes)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)
        txtSeleccionado.text=""
        btnServicios.setOnClickListener {
            txtSeleccionado.text="Boton Seleccionado:\n Servicios"
        }
        btnPortafolio.setOnClickListener {
            txtSeleccionado.text="Boton Seleccionado:\n Portafolio"
        }
        btnAcerca.setOnClickListener {
            txtSeleccionado.text="Boton Seleccionado:\n Acerca De"
        }
        btnContacto.setOnClickListener {
            txtSeleccionado.text="Boton Seleccionado:\n Contacto"
        }
        btnRedes.setOnClickListener {
            txtSeleccionado.text="Boton Seleccionado:\n Redes Sociales"
        }

        fun selectedButton(view: View){
            if (view.id===R.id.btn_servicios){
                Toast.makeText(view.context,"Opcion de servicios", Toast.LENGTH_LONG).show()
            }
            Toast.makeText(view.context,"Evento no definido", Toast.LENGTH_LONG).show()
        }
    }
}