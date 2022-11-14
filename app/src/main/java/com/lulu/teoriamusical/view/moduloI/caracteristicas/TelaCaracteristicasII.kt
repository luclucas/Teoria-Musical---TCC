package com.lulu.teoriamusical.view.moduloI.caracteristicas

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.lulu.teoriamusical.R
import com.lulu.teoriamusical.enums.Escolhas
import com.lulu.teoriamusical.model.Midia

class TelaCaracteristicasII : AppCompatActivity(){

    private lateinit var botaoMelodia: AppCompatButton
    private lateinit var botaoViolao: AppCompatButton
    private lateinit var botaoVoltar: AppCompatButton
    private lateinit var botaoAvancar: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_caracteristicasii)

        val midia = Midia()

        botaoViolao = findViewById(R.id.botao_violao)
        botaoViolao.setOnClickListener {
                midia.criarMidia(Escolhas.VIOLAO, this)
                midia.start()
        }

        botaoVoltar = findViewById(R.id.botao_car_volt_ii)
        botaoVoltar.setOnClickListener {
            midia.conferirMP()
            finish()
        }

        botaoAvancar = findViewById(R.id.botao_car_avan_ii)
        botaoAvancar.setOnClickListener {
            midia.conferirMP()
            val i = Intent(this, TelaCaracteristicasIII::class.java)
            startActivity(i)
        }

        botaoMelodia = findViewById(R.id.botao_melodia)
        botaoMelodia.setOnClickListener{
            midia.criarMidia(Escolhas.MELODIA_LA_VIE, this)
            midia.start()
        }

    }
}