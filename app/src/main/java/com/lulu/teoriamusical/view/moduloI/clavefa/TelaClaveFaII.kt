package com.lulu.teoriamusical.view.moduloI.clavefa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.lulu.teoriamusical.R

class TelaClaveFaII : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_clave_fa_ii)

        val botaoAvancar:AppCompatButton = findViewById(R.id.botao_fa_avan_ii)
        botaoAvancar.setOnClickListener{
            startActivity(Intent(this, TelaClaveFaIII::class.java))
        }

        val botaoVoltar:AppCompatButton = findViewById(R.id.botao_fa_volt_ii)
        botaoVoltar.setOnClickListener{
            finish()
        }
    }
}