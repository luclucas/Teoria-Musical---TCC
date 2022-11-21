package com.lulu.teoriamusical.view.moduloI.pautas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.lulu.teoriamusical.R

class TelaPautaII : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_pauta_ii)

        val botaoAvancar:AppCompatButton = findViewById(R.id.botao_pau_avan_ii)
        botaoAvancar.setOnClickListener{
            startActivity(Intent(this, TelaPautaIII::class.java))
        }

        val botaoVoltar:AppCompatButton = findViewById(R.id.botao_pau_volt_ii)
        botaoVoltar.setOnClickListener{
            finish()
        }
    }
}