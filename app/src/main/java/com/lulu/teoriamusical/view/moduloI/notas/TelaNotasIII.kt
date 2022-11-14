package com.lulu.teoriamusical.view.moduloI.notas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.lulu.teoriamusical.R
import com.lulu.teoriamusical.view.moduloI.ModuloI

class TelaNotasIII : AppCompatActivity() {

    lateinit var botaoVoltar:AppCompatButton
    lateinit var botaoAvancar:AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_notas_iii)


        botaoVoltar = findViewById(R.id.botao_notas_volt_iii)
        botaoVoltar.setOnClickListener {
            finish()
        }

        botaoAvancar = findViewById(R.id.botao_notas_avan_iii)
        botaoAvancar.setOnClickListener {
            val i = Intent(this, ModuloI::class.java)
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(i)
            finish()
        }
    }
}