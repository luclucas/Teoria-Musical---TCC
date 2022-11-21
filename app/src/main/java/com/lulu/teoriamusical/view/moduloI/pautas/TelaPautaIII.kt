package com.lulu.teoriamusical.view.moduloI.pautas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.lulu.teoriamusical.R
import com.lulu.teoriamusical.view.moduloI.ModuloI

class TelaPautaIII : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_pauta_iii)

       val botaoVoltar:AppCompatButton = findViewById(R.id.botao_pau_volt_iii)
        botaoVoltar.setOnClickListener {
            finish()
        }

        val botaoAvancar:AppCompatButton = findViewById(R.id.botao_pau_avan_iii)
        botaoAvancar.setOnClickListener {
            val i = Intent(this, ModuloI::class.java)
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(i)
            finish()
        }
    }
}