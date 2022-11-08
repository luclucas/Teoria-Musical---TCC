package com.lulu.teoriamusical.view.moduloI.caracteristicas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.lulu.teoriamusical.R

class TelaCaracteristicas : AppCompatActivity() {
    private lateinit var botaoAvancar: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_caracteristicas)
        botaoAvancar = findViewById(R.id.botao_car_avan_i)
        botaoAvancar.setOnClickListener{
           val i = Intent (this, TelaCaracteristicasII::class.java)
            startActivity(i)
        }
    }
}