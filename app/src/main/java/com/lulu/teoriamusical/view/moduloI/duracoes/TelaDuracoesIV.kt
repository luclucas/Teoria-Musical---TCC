package com.lulu.teoriamusical.view.moduloI.duracoes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.lulu.teoriamusical.R
import com.lulu.teoriamusical.view.moduloI.ModuloI

class TelaDuracoesIV : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_duracoes_iv)

        val botaoAvancar: AppCompatButton = findViewById(R.id.botao_dura_avan_iv)
        botaoAvancar.setOnClickListener {
            val i = Intent(this, ModuloI::class.java)
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(i)
            finish()
        }

        val botaoVoltar: AppCompatButton = findViewById(R.id.botao_dura_volt_iv)
        botaoVoltar.setOnClickListener {
            finish()
        }
    }
}