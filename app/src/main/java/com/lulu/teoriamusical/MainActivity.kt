package com.lulu.teoriamusical

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val classes = arrayOf(ModuloI::class.java, ModuloII::class.java, ModuloIII::class.java,
    ModuloIV::class.java)

    private var layoutManager: RecyclerView.LayoutManager? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewInicial)

        layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        val adaptador = RecyclerAdapterInicial()
        recyclerView.adapter = adaptador
        adaptador.setOnItemClickListener(object : RecyclerAdapterInicial.onItemClickListener {

            override fun onItemClick(position: Int) {
                verificaPosicao(position)
            }
        })
    }

    private fun verificaPosicao(position: Int) {
        gerarAtividade(this@MainActivity, classes[position])
    }

    private fun gerarAtividade(atividade: Activity, classe: Class<*>?) {
        val intent = Intent(atividade, classe)
        startActivity(intent)
    }
}
