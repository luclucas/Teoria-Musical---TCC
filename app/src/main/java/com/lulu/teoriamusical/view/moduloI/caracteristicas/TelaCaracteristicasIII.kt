package com.lulu.teoriamusical.view.moduloI.caracteristicas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.lulu.teoriamusical.R
import com.lulu.teoriamusical.enums.Escolhas
import com.lulu.teoriamusical.model.Midia
import com.lulu.teoriamusical.view.moduloI.ModuloI

class TelaCaracteristicasIII : AppCompatActivity(){

    private lateinit var botaoPiano: AppCompatButton
    private lateinit var botaoViolao: AppCompatButton
    private lateinit var botaoAvancar: AppCompatButton
    private lateinit var botaoVoltar: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_caracteristicas_iii)

        val midia = Midia()
        botaoViolao = findViewById(R.id.botao_violao_2)
        botaoViolao.setOnClickListener {
                midia.criarMidia(Escolhas.VIOLAO, this)
                midia.start()
        }


        botaoPiano = findViewById(R.id.botao_piano)
        botaoPiano.setOnClickListener {
                midia.criarMidia(Escolhas.PIANO, this)
                midia.start()
        }

        botaoVoltar = findViewById(R.id.botao_car_volt_iii)
        botaoVoltar.setOnClickListener {
            midia.conferirMP()
            finish()
        }

        botaoAvancar = findViewById(R.id.botao_car_avan_iii)
        botaoAvancar.setOnClickListener {
            midia.conferirMP()
            val i = Intent(this, ModuloI::class.java)
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(i)
            finish()
        }
    }

}