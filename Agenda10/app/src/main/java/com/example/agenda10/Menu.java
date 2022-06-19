package com.example.agenda10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        //Botões vindo da interface gráfica.
        Button btnSobEmpresaProg = (Button) findViewById(R.id.btnSobEmpresa);
        Button btnTelefoneProg = (Button) findViewById(R.id.btnTelefone);

        //Evento envia o usuário para a tela Sobre por meio do btnSobEmpresa
        btnSobEmpresaProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Menu.this, SobEmpresa.class);
                startActivity(it);
            }
        });

        //Evento que envia o usuário para a tela Telefone por meio do btnTelefone
        btnTelefoneProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Menu.this, Telefone.class);
                startActivity(it);
            }
        });
    }
}