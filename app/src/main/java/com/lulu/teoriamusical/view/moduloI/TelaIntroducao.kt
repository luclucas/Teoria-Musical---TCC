package com.lulu.teoriamusical.view.moduloI

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton
import com.lulu.teoriamusical.R

class TelaIntroducao : AppCompatActivity() {

    lateinit var button: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_introducao)

        val mp: MediaPlayer = MediaPlayer.create(this, R.raw.tema_vitoria)
        button =  findViewById(R.id.botaoOuvir)

        button.setOnClickListener{
            if(!mp.isPlaying)
                mp.start()
        }
    }



}