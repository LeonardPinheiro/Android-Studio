package com.example.agenda11;

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

        //Esconde a barra da activity
        getSupportActionBar().hide();

        //Deixa a activity em modo Tela cheia
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

            //Chama a activityMain após 5segundos por meio da função mostrarActivityMain
            new Handler().postDelayed(new Runnable(){
            @Override
                public void run() {
                    mostrarActivityMain();
                }
            }, 5000);
        }

        //função que chama a MainActivity e finaliza a ActivitySplash
    public void mostrarActivityMain() {
        Intent it = new Intent(Splash.this, MainActivity.class);
        startActivity(it);
        finish();
    }
}

