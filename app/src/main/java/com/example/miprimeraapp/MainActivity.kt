package com.example.miprimeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bSaludar =findViewById<Button>(R.id.bSaludar)
        val etNombre = findViewById<EditText>(R.id.editTextTextPersonName2)
        val cbDev=findViewById<CheckBox>(R.id.checkBox)


        bSaludar.setOnClickListener(View.OnClickListener {
            if(validarDato()) {
                if (cbDev.isChecked) {
                    Toast.makeText(
                        this,
                        "Bienvenido " + etNombre.text + ", Se que eres un programador",
                        Toast.LENGTH_LONG
                    ).show()
                } else {
                    Toast.makeText(this, "Bienvenido " + etNombre.text, Toast.LENGTH_LONG).show()
                }


                }else{
                Toast.makeText(this, "Escribe tu nombre para saludarte :)", Toast.LENGTH_SHORT).show()

            }
        })
    }
    fun validarDato():Boolean {
        val etNombre = findViewById<EditText>(R.id.editTextTextPersonName2)
        val nombreUsuario = etNombre.text

        if (nombreUsuario.isNullOrEmpty()) {
            return false
        }
        return true
    }

}