package com.example.jogodavelha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Esconde a barra
        getSupportActionBar().hide();

        //Deixa a tela em fullScreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //handler com tempo de 5 segundos
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //Chama a MainActivity
                Intent it = new Intent(Splash.this, MainActivity.class);
                startActivity(it);
                finish();
            }
        }, 5000);
    }
}