package com.example.agenda11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MpK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mpk);

        //Chama os EditText e os Botões da interface gráfica
        final EditText edtM_Prog = (EditText) findViewById(R.id.edtM);
        final EditText edtK_Prog = (EditText) findViewById(R.id.edtK);
        Button btnConverter_Prog = (Button) findViewById(R.id.btnConverter);
        Button btnNovo_Prog = (Button) findViewById(R.id.btnNovo);

        //Evento do click no botão
        btnConverter_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Converte e armazena o valor inserido na activity MpK
                double m = Double.parseDouble(edtM_Prog.getText().toString());
                double k = m/1000;

                //Envia de volta o valor para a tela activity
                edtK_Prog.setText(String.valueOf(k));
            }
        });

        //Evento que limpa o conteudo da tela
        btnNovo_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtM_Prog.setText("");
                edtK_Prog.setText("");
                edtM_Prog.requestFocus();
            }
        });
    }
}