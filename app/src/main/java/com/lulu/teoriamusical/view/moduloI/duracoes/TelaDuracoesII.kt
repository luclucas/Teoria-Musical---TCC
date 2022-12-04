package com.lulu.teoriamusical.view.moduloI.duracoes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.lulu.teoriamusical.R
import com.lulu.teoriamusical.view.moduloI.ModuloI

class TelaDuracoesII : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_duracoes_ii)

        val botaoAvancar: AppCompatButton = findViewById(R.id.botao_dura_avan_ii)
        botaoAvancar.setOnClickListener {
           startActivity(Intent(this, TelaDuracoesIII::class.java))
        }

        val botaoVoltar: AppCompatButton = findViewById(R.id.botao_dura_volt_ii)
        botaoVoltar.setOnClickListener {
            finish()
        }
    }
}