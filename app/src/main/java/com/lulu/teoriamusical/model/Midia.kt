package com.lulu.teoriamusical.model

import android.content.Context
import android.media.MediaPlayer
import com.lulu.teoriamusical.enums.Escolhas

/*
* Classe responsável pelas mídias de audio que existirão durante a aplicacao
*
*
* */

class Midia {
    var mp = MediaPlayer()

     fun criarMidia(e: Escolhas, c: Context){
        mp = MediaPlayer.create(c, e.som)
    }

     fun conferirMP() {
         if(mp.isPlaying)
             mp.stop()
    }

    fun start(){
        mp.start()
    }
}