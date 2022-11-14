package com.lulu.teoriamusical.view.moduloI.notas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.lulu.teoriamusical.R

class TelaNotas : AppCompatActivity() {
    private lateinit var botaoAvancar: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_notas)

        botaoAvancar = findViewById(R.id.botao_notas_avan_i)
        botaoAvancar.setOnClickListener{
            val i = Intent(this, TelaNotasII::class.java)
            startActivity(i)
        }
    }
}