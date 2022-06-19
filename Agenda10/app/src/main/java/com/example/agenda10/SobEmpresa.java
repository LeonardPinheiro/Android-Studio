package com.example.agenda10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SobEmpresa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telefone);

        //Botão vindo da tela Sobre por meio do btnVoltar2
        Button btnVoltar2Prog = (Button) findViewById(R.id.btnVoltar2);

        //Evento que envia o usuário para a tela de Menu.
        btnVoltar2Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(SobEmpresa.this, Menu.class);
                startActivity(it);
            }
        });
    }
}