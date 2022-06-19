package com.example.jogodavelha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Variavel do metodo iniciada em X, armazena X ou O
    String jogador = "X";

    //metodo com estrutura de decisão
    public void  trocajogador (){
        if(jogador.equals("X")){
            jogador = "O";
        }else{
            jogador = "X";
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        //Chamada dos Botões
        TextView txtJogador = (TextView) findViewById(R.id.txtJogador);

        Button btn11Prog = (Button) findViewById(R.id.btn11);
        Button btn12Prog = (Button) findViewById(R.id.btn12);
        Button btn13Prog = (Button) findViewById(R.id.btn13);

        Button btn21Prog = (Button) findViewById(R.id.btn21);
        Button btn22Prog = (Button) findViewById(R.id.btn22);
        Button btn23Prog = (Button) findViewById(R.id.btn23);

        Button btn31Prog = (Button) findViewById(R.id.btn31);
        Button btn32Prog = (Button) findViewById(R.id.btn32);
        Button btn33Prog = (Button) findViewById(R.id.btn33);

        Button btnReset = (Button) findViewById(R.id.btnReset);

        //-----------Evento de click dos Botões ------------
        btn11Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Coloca o texto que esta dentro da variavel do metodo no  botão
                btn11Prog.setText(jogador);

                //Altera a cor do Botão
                btn11Prog.setBackgroundColor(R.color.cardview_shadow_end_color);

                //Chamada do metodo
                trocajogador();

                //Desativa o click do botão
                btn11Prog.setClickable(false);

                //Coloca um texto no txtJogador com o valor armazenado na variavel do metodo
                txtJogador.setText("Jogador: "+jogador);
            }
        });

        btn12Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Coloca o texto que esta dentro da variavel do metodo no  botão
                btn12Prog.setText(jogador);

                //Altera a cor do Botão
                btn12Prog.setBackgroundColor(R.color.cardview_shadow_end_color);

                //Chamada do metodo
                trocajogador();

                //Desativa o click do botão
                btn12Prog.setClickable(false);

                //Coloca um texto no txtJogador com o valor armazenado na variavel do metodo
                txtJogador.setText("Jogador: "+jogador);
            }
        });

        btn13Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Coloca o texto que esta dentro da variavel do metodo no  botão
                btn13Prog.setText(jogador);

                //Altera a cor do Botão
                btn13Prog.setBackgroundColor(R.color.cardview_shadow_end_color);

                //Chamada do metodo
                trocajogador();

                //Desativa o click do botão
                btn13Prog.setClickable(false);

                //Coloca um texto no txtJogador com o valor armazenado na variavel do metodo
                txtJogador.setText("Jogador: "+jogador);
            }
        });

        btn21Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Coloca o texto que esta dentro da variavel do metodo no  botão
                btn21Prog.setText(jogador);

                //Altera a cor do Botão
                btn21Prog.setBackgroundColor(R.color.cardview_shadow_end_color);

                //Chama o metodo
                trocajogador();

                //Desativa o click do botão
                btn21Prog.setClickable(false);

                //Coloca um texto no txtJogador com o valor armazenado na variavel do metodo
                txtJogador.setText("Jogador: "+jogador);
            }
        });

        btn22Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Coloca o texto que esta dentro da variavel do metodo no  botão
                btn22Prog.setText(jogador);

                //Altera a cor do Botão
                btn22Prog.setBackgroundColor(R.color.cardview_shadow_end_color);

                //Chamada do metodo
                trocajogador();

                //Desativa o click do botão
                btn22Prog.setClickable(false);

                //Coloca um texto no txtJogador com o valor armazenado na variavel do metodo
                txtJogador.setText("Jogador: "+jogador);
            }
        });

        btn23Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Coloca o texto que esta dentro da variavel do metodo no  botão
                btn23Prog.setText(jogador);

                //Altera a cor do Botão
                btn23Prog.setBackgroundColor(R.color.cardview_shadow_end_color);

                //Chamada do metodo
                trocajogador();

                //Desativa o click do botão
                btn23Prog.setClickable(false);

                //Coloca um texto no txtJogador com o valor armazenado na variavel do metodo
                txtJogador.setText("Jogador: "+jogador);
            }
        });

        btn31Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Coloca o texto que esta dentro da variavel do metodo no  botão
                btn31Prog.setText(jogador);

                //Altera a cor do Botão
                btn31Prog.setBackgroundColor(R.color.cardview_shadow_end_color);

                //Chamada do metodo
                trocajogador();

                //Desativa o click do botão
                btn31Prog.setClickable(false);

                //Coloca um texto no txtJogador com o valor armazenado na variavel do metodo
                txtJogador.setText("Jogador: "+jogador);
            }
        });

        btn32Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Coloca o texto que esta dentro da variavel do metodo no  botão
                btn32Prog.setText(jogador);

                //Altera a cor do Botão
                btn32Prog.setBackgroundColor(R.color.cardview_shadow_end_color);

                //Chamada do metodo
                trocajogador();

                //Desativa o click do botão
                btn32Prog.setClickable(false);

                //Coloca um texto no txtJogador com o valor armazenado na variavel do metodo
                txtJogador.setText("Jogador: "+jogador);
            }
        });

        btn33Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Coloca o texto que esta dentro da variavel do metodo no  botão
                btn33Prog.setText(jogador);

                //Altera a cor do Botão
                btn33Prog.setBackgroundColor(R.color.cardview_shadow_end_color);

                //Chamada do metodo
                trocajogador();

                //Desativa o click do botão
                btn33Prog.setClickable(false);

                //Coloca um texto no txtJogador com o valor armazenado na variavel do metodo
                txtJogador.setText("Jogador: "+jogador);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*Em uma visão geral, Esvazia o texto, ativa o click e adiciona uma nova cor */
                btn11Prog.setText("");
                btn11Prog.setClickable(true);
                btn11Prog.setBackgroundColor(R.color.purple_700);

                btn12Prog.setText("");
                btn12Prog.setClickable(true);
                btn12Prog.setBackgroundColor(R.color.purple_700);

                btn13Prog.setText("");
                btn13Prog.setClickable(true);
                btn13Prog.setBackgroundColor(R.color.purple_700);

                btn21Prog.setText("");
                btn21Prog.setClickable(true);
                btn21Prog.setBackgroundColor(R.color.purple_700);

                btn22Prog.setText("");
                btn22Prog.setClickable(true);
                btn22Prog.setBackgroundColor(R.color.purple_700);

                btn23Prog.setText("");
                btn23Prog.setClickable(true);
                btn23Prog.setBackgroundColor(R.color.purple_700);

                btn31Prog.setText("");
                btn31Prog.setClickable(true);
                btn31Prog.setBackgroundColor(R.color.purple_700);

                btn32Prog.setText("");
                btn32Prog.setClickable(true);
                btn32Prog.setBackgroundColor(R.color.purple_700);

                btn33Prog.setText("");
                btn33Prog.setClickable(true);
                btn33Prog.setBackgroundColor(R.color.purple_700);

                btnReset.setBackgroundColor(R.color.purple_700);
            }
        });
    }
}