package com.example.prototypechecklist.ui.activity

import android.icu.math.BigDecimal
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.annotation.RequiresApi
import androidx.compose.ui.text.input.TextFieldValue
import com.example.prototypechecklist.R
import com.example.prototypechecklist.dao.ProdutosDao
import com.example.prototypechecklist.model.Cadastro

class FormularioActivity : AppCompatActivity(R.layout.activity_formulario) {

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val salvar = findViewById<Button>(R.id.salvar)
        salvar.setOnClickListener {
            val campoPlaca = findViewById<EditText>(R.id.placaValor)
            val placa = campoPlaca.text.toString()
            val campoModeloBase = findViewById<EditText>(R.id.modeloBaseValor)
            val modeloBase = campoModeloBase.text.toString()
            val campoUf = findViewById<EditText>(R.id.ufValor)
            val uf = campoUf.text.toString()
            val campoLoja = findViewById<EditText>(R.id.lojaValor)
            val loja = campoLoja.text.toString()
            val campoTipoServico = findViewById<EditText>(R.id.tipoServicoValor)
            val tipoServico = campoTipoServico.text.toString()
            val campoTipoFiscaliza = findViewById<EditText>(R.id.tipoFiscalizacaoValor)
            val tipoFiscalizacao = campoTipoFiscaliza.text.toString()
            val campoInstalador = findViewById<EditText>(R.id.instaladorValor)
            val instalador = campoInstalador.text.toString()
            val campoTipokit = findViewById<EditText>(R.id.tipoKit1Valor)
            val tipoKit1 = campoTipokit.text.toString()
            val campoPocSag = findViewById<EditText>(R.id.pocsagValor)
            val pocsag = campoPocSag.text.toString()
            val campoTipokit2 = findViewById<EditText>(R.id.tipoKit2Valor)
            val tipoKit2 = campoTipokit2.text.toString()
            val campoPocSag2 = findViewById<EditText>(R.id.pocsag2Valor)
            val pocsag2 = campoPocSag2.text.toString()
            val campoOdometro = findViewById<EditText>(R.id.odometroValor)
            val odometro = campoOdometro.text.toString()


            val cadastroNew = Cadastro(
                placa = placa,
                modeloBase = modeloBase,
                uf = uf,
                loja = loja,
                tipoDeServivo = tipoServico,
                tipoDeFiscalizacao = tipoFiscalizacao,
                instalador = instalador,
                tipoKit1 = tipoKit1,
                pocSag1 = pocsag,
                tipoKit2 = tipoKit2,
                pocSag2 = pocsag2,
                odometro = odometro
            )
            Log.i("From",  "Oncreate: $cadastroNew")
            val dao = ProdutosDao()
            ProdutosDao().add(cadastroNew)
            Log.i("From",  "Oncreate: ${dao.findAll()}")
            finish()
        }


    }



}