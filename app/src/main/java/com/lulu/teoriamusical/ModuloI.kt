package com.lulu.teoriamusical

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

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
}