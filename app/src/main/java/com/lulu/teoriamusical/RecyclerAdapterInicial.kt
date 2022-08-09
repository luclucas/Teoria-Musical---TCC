package com.lulu.teoriamusical

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapterInicial: RecyclerView.Adapter<RecyclerAdapterInicial.ViewHolder>() {

    private lateinit var mListener: onItemClickListener

    private val titulos = arrayOf("Módulo I", "Módulo II", "Módulo III", "Módulo IV")
    private val descricoes = arrayOf("Conteudo I", "Conteudo II", "Conteudo III", "Conteudo IV")
    private val imagens = arrayOf(R.drawable.img_semibreve, R.drawable.img_minima,
    R.drawable.img_seminima, R.drawable.img_colcheia)

    override fun onCreateViewHolder(parent: ViewGroup, viewType:Int):RecyclerAdapterInicial.ViewHolder{
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_tela_inicial, parent, false)
        return ViewHolder(v, mListener)
    }

    override fun getItemCount(): Int {
        return titulos.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapterInicial.ViewHolder, position: Int) {
        holder.tituloItem.text = titulos[position]
        holder.descricaoItem.text = descricoes[position]
        holder.imagemItem.setImageResource(imagens[position])
    }

    inner class ViewHolder(itenView: View, listener: onItemClickListener): RecyclerView.ViewHolder(itenView){
        var imagemItem: ImageView
        var tituloItem: TextView
        var descricaoItem: TextView

        init {
            itenView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
            imagemItem = itemView.findViewById(R.id.imagem_item)
            tituloItem = itemView.findViewById(R.id.titulo_item)
            descricaoItem = itemView.findViewById(R.id.descricao_item)
        }
    }

    //Criando Listeners para cada card ter gerar uma nova atividade

    interface onItemClickListener{
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener){
        mListener = listener
    }
}