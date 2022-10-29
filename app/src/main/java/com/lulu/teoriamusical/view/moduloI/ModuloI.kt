package com.lulu.teoriamusical.view.moduloI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.lulu.teoriamusical.R
import com.lulu.teoriamusical.view.TelaQuiz
class ModuloI : AppCompatActivity() {

    lateinit var botaoQuiz: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modulo_i)
    }

    fun quiz(view: View){
        val intent = Intent(this, TelaQuiz::class.java)
        startActivity(intent)
    }

    fun irIntroducao (view: View){
        val i = Intent(this,TelaIntroducao::class.java)
        startActivity(i)
    }

    fun irCaracteristicas (view: View){
        val i = Intent(this,TelaCaracteristicas::class.java)
        startActivity(i)
    }

}