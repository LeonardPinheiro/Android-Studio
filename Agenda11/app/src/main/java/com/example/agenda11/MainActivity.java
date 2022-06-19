package com.example.agenda11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Chamada dos botões da interface gráfica
        Button btnKM_Prog = (Button) findViewById(R.id.btnKM);
        Button btnMK_Prog = (Button) findViewById(R.id.btnMK);
        Button btnMC_Prog = (Button) findViewById(R.id.btnMC);
        Button btnCM_Prog = (Button) findViewById(R.id.btnCM);

        //Envia o usuário para a tela de Km > Metro
        btnKM_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, kmm.class);
                startActivity(it);
            }
        });
        //Envia o usuário para a tela de Metro > Km
        btnMK_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, MpK.class);
                startActivity(it);
            }
        });
        //Envia o usuário para a tela de Metro > CM
        btnMC_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, MpC.class);
                startActivity(it);
            }
        });
        //Envia o usuário para a tela de CM > Metro
        btnCM_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, CpM.class);
                startActivity(it);
            }
        });
    }
}