package com.example.prototypechecklist.ui.recycleview.adapter

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.prototypechecklist.R
import com.example.prototypechecklist.model.Cadastro

class ListaCadastroAdapter(
    private val context: Context,
    private val cadastros : List<Cadastro>
) : RecyclerView.Adapter<ListaCadastroAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        @RequiresApi(Build.VERSION_CODES.N)
        fun vincula(cadastro: Cadastro) {
            val placa = itemView.findViewById<TextView>(R.id.placa)
            placa.text = cadastro.placa
            val modeloBase = itemView.findViewById<TextView>(R.id.modeloBase)
            modeloBase.text = cadastro.modeloBase
            val uf = itemView.findViewById<TextView>(R.id.uf)
            uf.text = cadastro.uf
            val loja = itemView.findViewById<TextView>(R.id.loja)
            loja.text = cadastro.loja
            val tipoServico = itemView.findViewById<TextView>(R.id.tipoServico)
            tipoServico.text = cadastro.tipoDeServivo
            val tipoFiscalizacao = itemView.findViewById<TextView>(R.id.tipoFiscalizacao)
            tipoFiscalizacao.text = cadastro.tipoDeFiscalizacao
            val instalador = itemView.findViewById<TextView>(R.id.instalador)
            instalador.text = cadastro.instalador
            val tipoKit1 = itemView.findViewById<TextView>(R.id.tipoKit1)
            tipoKit1.text = cadastro.tipoKit1
            val pocSag1 = itemView.findViewById<TextView>(R.id.pocsag)
            pocSag1.text = cadastro.pocSag1
            val tipoKit2 = itemView.findViewById<TextView>(R.id.tipoKit2)
            tipoKit2.text = cadastro.tipoKit2
            val pocSag2 = itemView.findViewById<TextView>(R.id.pocsag2)
            pocSag2.text = cadastro.pocSag2

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.cadastro_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cadastros.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cadastro = cadastros[position]
        holder.vincula(cadastro)

    }

}
