package com.lulu.teoriamusical.view.moduloI.duracoes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.lulu.teoriamusical.R

class TelaDuracoesIII : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_duracoes_iii)

        val botaoAvancar: AppCompatButton = findViewById(R.id.botao_dura_avan_iii)
        botaoAvancar.setOnClickListener {
            startActivity(Intent(this, TelaDuracoesIV::class.java))
        }

        val botaoVoltar: AppCompatButton = findViewById(R.id.botao_dura_volt_iii)
        botaoVoltar.setOnClickListener {
            finish()
        }
    }
}