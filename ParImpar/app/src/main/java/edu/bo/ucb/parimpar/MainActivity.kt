package edu.bo.ucb.parimpar

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var number=0
    private var correcto=0
    private var incorect=0
    private val btn_par :Button
        get() = findViewById(R.id.btnPar)
    private val btn_impar : Button
        get() = findViewById(R.id.btnImpar)
    private val txt_correcto : TextView
        get() = findViewById(R.id.txtCorrectos)
    private val txt_incorrecto : TextView
        get() = findViewById(R.id.txtIncorrectos)
    private val txt_num : TextView
        get() = findViewById(R.id.txtNumero)
    private val toolbar: Toolbar get() = findViewById(R.id.toolbar)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar.let {
            setSupportActionBar(toolbar)
        }

        randNum()
        btn_par.setOnClickListener {
            if (number%2===0){
                correcto++
                txt_correcto.text="Correctas: $correcto"
            }
            else
            {
                incorect++
                txt_incorrecto.text="Incorrectas: $incorect"
            }
            randNum()
        }
        btn_impar.setOnClickListener {
            if (number%2===0){
                incorect++
                txt_incorrecto.text="Incorrectas: $incorect"
            }
            else
            {
                correcto++
                txt_correcto.text="Correctas: $correcto"
            }
            randNum()
        }
    }
    private fun randNum(){
        number = (Math.random() * 10 + 1).toInt()
        txt_num.text=number.toString();
    }
}