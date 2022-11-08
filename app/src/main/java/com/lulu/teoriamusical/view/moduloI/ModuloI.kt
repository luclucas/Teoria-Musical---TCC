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

    fun irIntroducao (view: View){
        val i = Intent(this,TelaIntroducao::class.java)
        startActivity(i)
    }

    fun irCaracteristicas (view: View){
        retornarIntent(Telas.CARACTERISTICAS)
    }

    fun irNotas(view: View){
        retornarIntent(Telas.NOTAS)
    }

    private fun retornarIntent(t: Telas){
        when (t){
            Telas.CARACTERISTICAS -> startActivity(Intent(this, TelaCaracteristicas::class.java))
            Telas.NOTAS -> startActivity(Intent(this, TelaNotas::class.java))
        }

        }
    }

