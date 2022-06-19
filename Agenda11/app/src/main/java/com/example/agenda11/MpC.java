package com.example.agenda11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MpC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mpc);

        //Chamada dos EditText e dos botões da interface gráfica
        final EditText edtM_Prog = (EditText) findViewById(R.id.edtM);
        final EditText edtC_Prog = (EditText) findViewById(R.id.edtC);
        Button btnConverter_Prog = (Button) findViewById(R.id.btnConverter);
        Button btnNovo_Prog = (Button) findViewById(R.id.btnNovo);

        //Evento de click no botão
        btnConverter_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Armazena e converte o conteudo inserido na activity MpC
                double m = Double.parseDouble(edtM_Prog.getText().toString());
                double c = m*100;

                //Envia de volta o valor para a activity
                edtC_Prog.setText(String.valueOf(c));
            }
        });

        //Evento que limpa o conteúdo da tela
        btnNovo_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtM_Prog.setText("");
                edtC_Prog.setText("");
                edtM_Prog.requestFocus();
            }
        });
    }
}