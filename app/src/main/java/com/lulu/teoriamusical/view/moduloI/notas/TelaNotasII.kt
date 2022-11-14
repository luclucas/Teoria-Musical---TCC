package com.lulu.teoriamusical.view.moduloI.notas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.lulu.teoriamusical.R
import com.lulu.teoriamusical.enums.Escolhas
import com.lulu.teoriamusical.model.Midia

class TelaNotasII : AppCompatActivity(){
    private lateinit var botaoVoltar: AppCompatButton
    private lateinit var botaoAvancar: AppCompatButton
    private lateinit var botaoEscala: AppCompatButton
    private lateinit var midia: Midia

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_notas_ii)

        midia = Midia()

        botaoVoltar = findViewById(R.id.botao_notas_volt_ii)
        botaoVoltar.setOnClickListener{
            midia.conferirMP()
            finish()
        }

        botaoAvancar = findViewById(R.id.botao_notas_avan_ii)
        botaoAvancar.setOnClickListener{
            midia.conferirMP()
            val i = Intent(this, TelaNotasIII::class.java)
            startActivity(i)
        }

        botaoEscala = findViewById(R.id.botao_notas_escala)
        botaoEscala.setOnClickListener{
            midia.criarMidia(Escolhas.ESCALA_C, this)
            midia.start()
        }

    }
}