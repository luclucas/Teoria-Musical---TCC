package com.lulu.teoriamusical.view.moduloI.caracteristicas

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.lulu.teoriamusical.R
import com.lulu.teoriamusical.enums.Escolhas
import com.lulu.teoriamusical.view.moduloI.ModuloI

class TelaCaracteristicasIII : AppCompatActivity() {

    private lateinit var botaoPiano: AppCompatButton
    private lateinit var botaoViolao: AppCompatButton
    private lateinit var botaoAvancar: AppCompatButton
    private lateinit var botaoVoltar: AppCompatButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_caracteristicas_iii)

        var mp = MediaPlayer()
        botaoViolao = findViewById(R.id.botao_violao_2)
        botaoViolao.setOnClickListener {
            conferirMP(mp)
                mp = criarMidia(Escolhas.VIOLAO)
                mp.start()
        }


        botaoPiano = findViewById(R.id.botao_piano)
        botaoPiano.setOnClickListener {
                conferirMP(mp)
                mp = criarMidia(Escolhas.PIANO)
                mp.start()
        }

        botaoVoltar = findViewById(R.id.botao_car_volt_iii)
        botaoVoltar.setOnClickListener {
            conferirMP(mp)
            finish()
        }

        botaoAvancar = findViewById(R.id.botao_car_avan_iii)
        botaoAvancar.setOnClickListener {
            conferirMP(mp)
            val i = Intent(this, ModuloI::class.java)
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(i)
            finish()
        }



    }

    private fun criarMidia(e: Escolhas): MediaPlayer {
        return if(e == Escolhas.VIOLAO) {
            MediaPlayer.create(this, R.raw.c_violao)
        } else {
            MediaPlayer.create(this, R.raw.c_piano)
        }
    }

    //confere se a MediaPlayer está tocando
    private fun conferirMP(mp: MediaPlayer){
        if(mp.isPlaying){
            mp.stop()
        }
    }
}