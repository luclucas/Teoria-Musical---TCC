package com.lulu.teoriamusical.view.moduloI.clavesol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.lulu.teoriamusical.R

class TelaClaveSol : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_clave_sol)

        val botaoAvancar:AppCompatButton = findViewById(R.id.botao_sol_avan_i)
        botaoAvancar.setOnClickListener{
            startActivity(Intent(this, TelaClaveSolII::class.java))
        }
    }
}