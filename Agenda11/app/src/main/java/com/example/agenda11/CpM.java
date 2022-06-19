package com.example.agenda11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CpM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpm);

        //Chamada dos EditText e dos botões da interface gráfica
        final EditText edtC_Prog = (EditText) findViewById(R.id.edtC);
        final EditText edtM_Prog = (EditText) findViewById(R.id.edtM);
        Button btnConverter_Prog = (Button) findViewById(R.id.btnConverter);
        Button btnNovo_Prog = (Button) findViewById(R.id.btnNovo);

        //Evento de click no botão
        btnConverter_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Armazena e converte o valor inserido na interface gráfica
                double c = Double.parseDouble(edtC_Prog.getText().toString());
                double m = c/100;

                edtM_Prog.setText(String.valueOf(m));
            }
        });

        //Evento que limpa a tela
        btnNovo_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtC_Prog.setText("");
                edtM_Prog.setText("");
                edtC_Prog.requestFocus();
            }
        });
    }
}