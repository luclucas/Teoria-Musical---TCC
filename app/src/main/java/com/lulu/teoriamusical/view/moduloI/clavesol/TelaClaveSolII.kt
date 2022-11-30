package com.lulu.teoriamusical.view.moduloI.clavesol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.lulu.teoriamusical.R
import com.lulu.teoriamusical.view.moduloI.ModuloI

class TelaClaveSolII : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_clave_sol_ii)

        val botaoAvancar: AppCompatButton = findViewById(R.id.botao_sol_avan_ii)
        botaoAvancar.setOnClickListener {
            val i = Intent(this, ModuloI::class.java)
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(i)
            finish()
        }

        val botaoVoltar: AppCompatButton = findViewById(R.id.botao_sol_volt_ii)
        botaoVoltar.setOnClickListener {
            finish()
        }
    }
}