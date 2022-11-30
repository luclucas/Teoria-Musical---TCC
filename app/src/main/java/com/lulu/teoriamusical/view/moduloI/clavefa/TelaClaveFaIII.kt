package com.lulu.teoriamusical.view.moduloI.clavefa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.lulu.teoriamusical.R
import com.lulu.teoriamusical.view.moduloI.ModuloI

class TelaClaveFaIII : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_clave_fa_iii)

        val botaoAvancar: AppCompatButton = findViewById(R.id.botao_fa_avan_iii)
        botaoAvancar.setOnClickListener{
            val i = Intent(this, ModuloI::class.java)
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(i)
            finish()
        }

        val botaoVoltar: AppCompatButton = findViewById(R.id.botao_fa_volt_iii)
        botaoVoltar.setOnClickListener{
            finish()
        }
    }
}