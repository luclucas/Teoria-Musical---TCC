package com.lulu.teoriamusical.view.moduloI

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.lulu.teoriamusical.R

enum class Escolha (val valor:Int) {
    VIOLAO(0), PIANO(1)
}

class TelaCaracteristicas : AppCompatActivity() {


    lateinit var botaoViolao: AppCompatButton
    lateinit var mp: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_caracteristicas)

        mp = MediaPlayer()
        botaoViolao = findViewById(R.id.botaoViolao)
        botaoViolao.setOnClickListener{
            if(!mp.isPlaying){
                mp = criarMidia(Escolha.VIOLAO)
                mp.start()
            }
        }
    }
    fun criarMidia(e: Escolha): MediaPlayer{
        if(e.name == "VIOLAO"){
            return MediaPlayer.create(this, R.raw.c_violao)
        } else {
            return MediaPlayer.create(this, R.raw.c_piano)
        }
    }
}