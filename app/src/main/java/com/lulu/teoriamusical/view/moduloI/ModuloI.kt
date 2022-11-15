package com.lulu.teoriamusical.view.moduloI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.lulu.teoriamusical.R
import com.lulu.teoriamusical.enums.Telas
import com.lulu.teoriamusical.view.TelaQuiz
import com.lulu.teoriamusical.view.moduloI.caracteristicas.TelaCaracteristicas
import com.lulu.teoriamusical.view.moduloI.notas.TelaNotas

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

    fun irCaracteristicas (view: View){
        retornarIntent(Telas.CARACTERISTICAS)
    }

    fun irNotas(view: View){
        retornarIntent(Telas.NOTAS)
    }

    fun irPauta(view:View){
        retornarIntent(Telas.PAUTA)
    }

    private fun retornarIntent(t: Telas){
        startActivity(Intent(this, t.e))
        }
    }

