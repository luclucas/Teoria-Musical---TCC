package com.lulu.teoriamusical.view.moduloI.caracteristicas

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.lulu.teoriamusical.R
import com.lulu.teoriamusical.enums.Escolhas

class TelaCaracteristicasII : AppCompatActivity() {

    private lateinit var botaoMelodia: AppCompatButton
    private lateinit var botaoViolao: AppCompatButton
    private lateinit var botaoVoltar: AppCompatButton
    private lateinit var botaoAvancar: AppCompatButton
    private lateinit var mp: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_caracteristicasii)

        mp = MediaPlayer()

        botaoViolao = findViewById(R.id.botao_violao)
        botaoViolao.setOnClickListener {
                conferirMP(mp)
                mp = criarMidia(Escolhas.VIOLAO)
                mp.start()
        }

        botaoVoltar = findViewById(R.id.botao_car_volt_ii)
        botaoVoltar.setOnClickListener {
            conferirMP(mp)
            finish()
        }

        botaoAvancar = findViewById(R.id.botao_car_avan_ii)
        botaoAvancar.setOnClickListener {
            conferirMP(mp)
            val i = Intent(this, TelaCaracteristicasIII::class.java)
            startActivity(i)
        }

        botaoMelodia = findViewById(R.id.botao_melodia)
        botaoMelodia.setOnClickListener{
            conferirMP(mp)
            mp = criarMidia(Escolhas.MELODIA)
            mp.start()
        }

    }

    private fun criarMidia(e: Escolhas): MediaPlayer {
        // 0 para violao else para a melodia

        return if(e == Escolhas.VIOLAO){
            MediaPlayer.create(this, R.raw.c_violao)
        } else  {
            MediaPlayer.create(this, R.raw.melo_la_vie)
        }
    }
    //confere se a MediaPlayer está tocando
    private fun conferirMP(mp: MediaPlayer){
        if(mp.isPlaying){
            mp.stop()
        }
    }

    private fun onPrepared(mp:MediaPlayer){
        mp.start()
    }

}