package com.lulu.teoriamusical.view.moduloI.duracoes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.lulu.teoriamusical.R

class TelaDuracoes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_duracoes)

        val botaoAvancar = findViewById<AppCompatButton>(R.id.botao_dura_avan_i)
        botaoAvancar.setOnClickListener{
            startActivity(Intent(this, TelaDuracoesII::class.java))
        }
    }
}