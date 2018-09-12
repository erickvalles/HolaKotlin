package com.example.erick.holakotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnInicio.setOnClickListener {
            if (!etUsuario.text.toString().equals("") && !etPass.text.toString().equals("")){
                if(etUsuario.text.toString().equals("Erick") && etPass.text.toString().equals("hola")){
                    toast("Bienvenido")
                }else{
                    toast("Las credenciales no funcionan")
                }
            }else{
                toast("No puedes dejar campos sin llenar")
            }
        }
    }
    fun toast(texto:String){
        Toast.makeText(applicationContext,texto,Toast.LENGTH_LONG).show()
    }
}
