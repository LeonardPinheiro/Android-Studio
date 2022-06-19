package com.example.agenda10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Telefone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sobre);

        //Botão vindo da tela Telefone por meio do btnVoltar3
        Button btnVoltar3Prog = (Button) findViewById(R.id.btnVoltar3);

        //Evento que envia o usuário para a tela inicial
        btnVoltar3Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Telefone.this, Menu.class);
                startActivity(it);
            }
        });
    }
}