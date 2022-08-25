package com.lulu.teoriamusical

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class TelaQuiz : AppCompatActivity() {

   private lateinit var botaoUm:Button
   private lateinit var botaoDois:Button
   private lateinit var botaoTres:Button
   private lateinit var botaoQuatro:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_quiz)
        botaoUm = findViewById(R.id.alternativaI)
        botaoDois = findViewById(R.id.alternativaII)
        botaoTres = findViewById(R.id.alternativaIII)
        botaoQuatro = findViewById(R.id.alternativaIV)

    }

    fun selecionarBotao(view: View){
        val b: Button = findViewById(view.id)
        limparBotoes()
        b.setBackgroundColor(Color.GREEN)
        b.setTextColor(Color.WHITE)

    }

    private fun limparBotoes(){
        botaoUm.setBackgroundColor(Color.WHITE)
        botaoDois.setBackgroundColor(Color.WHITE)
        botaoTres.setBackgroundColor(Color.WHITE)
        botaoQuatro.setBackgroundColor(Color.WHITE)
    }

}