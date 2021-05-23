package com.cursoandroid.projeto_cara_ou_coroa_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imageResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageResultado = findViewById(R.id.imageResultado);

        //Recuperar dados
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if (numero == 0){//cara
            imageResultado.setImageResource(R.drawable.moeda_cara);
        }else {//coroa
            imageResultado.setImageResource(R.drawable.moeda_coroa);
        }
    }
}