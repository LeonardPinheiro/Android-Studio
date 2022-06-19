package com.example.agenda11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class kmm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kmm);

        //Chamada dos EditText e dos Botões da interface gráfica
        final EditText edtKmM_Prog = (EditText) findViewById(R.id.edtK);
        final EditText edtMetros_Prog = (EditText) findViewById(R.id.edtMetros);
        Button btnConverter = (Button) findViewById(R.id.btnConverter);
        Button btnNovo_Prog = (Button) findViewById(R.id.btnNovo);

        //Evento de click no Botão
        btnConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //converte e armazena o valor inserido na activity Kmm
                double km = Double.parseDouble(edtKmM_Prog.getText().toString());
                double m = km*1000;

                //envia o valor de volta para a tela principal da activity
                edtMetros_Prog.setText(String.valueOf(m));
            }
        });

        //Evento que limpa o conteudo da tela
        btnNovo_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtKmM_Prog.setText("");
                edtMetros_Prog.setText("");
                edtKmM_Prog.requestFocus();
            }
        });
    }
}