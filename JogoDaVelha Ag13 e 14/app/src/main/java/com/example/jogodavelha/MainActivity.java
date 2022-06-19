package com.example.jogodavelha;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    //Matriz para verificação
    String[][] matrizVerificacao = new String [3][3];

    //Variável do método iniciada em X, armazena X ou O
    String jogador = "X";

    //Variável para Empate
    int jogadas = 0;

    //método com estrutura de decisão
    public void  trocajogador (){
        if(jogador.equals("X")){
            jogador = "O";
        }else{
            jogador = "X";
        }
        jogadas = jogadas + 1;
    }

    //método para inicializar a matriz
    public void inicializaMatrizVerificacao(){
        for(int linha = 0; linha < 3; linha++)
        {
            for(int coluna = 0; coluna < 3; coluna++)
            {
                matrizVerificacao[linha][coluna] = String.valueOf(linha) + String.valueOf(coluna);
            }
        }
    }


    //Método de verificação do Ganhador
    private boolean verificaGanhador(){

        boolean ganhador = false;

        //Verificação horozontal
        if(matrizVerificacao[0][0].equals(matrizVerificacao[0][1]) &&
        matrizVerificacao[0][0].equals(matrizVerificacao[0][2]))
        {
            ganhador = true;
        }

        if(matrizVerificacao[1][0].equals(matrizVerificacao[1][1]) &&
        matrizVerificacao[1][0].equals(matrizVerificacao[1][2]))
        {
            ganhador = true;
        }

        if(matrizVerificacao[2][0].equals(matrizVerificacao[2][1]) &&
        matrizVerificacao[2][0].equals(matrizVerificacao[2][2]))
        {
            ganhador = true;
        }

        //Verificação vertical
        if(matrizVerificacao[0][0].equals(matrizVerificacao[1][0]) &&
        matrizVerificacao[0][0].equals(matrizVerificacao[2][0]))
        {
            ganhador = true;
        }

        if(matrizVerificacao[0][1].equals(matrizVerificacao[1][1]) &&
        matrizVerificacao[0][1].equals(matrizVerificacao[2][1]))
        {
            ganhador = true;
        }

        if(matrizVerificacao[0][2].equals(matrizVerificacao[1][2]) &&
        matrizVerificacao[0][2].equals(matrizVerificacao[2][2]))
        {
            ganhador = true;
        }

        //Diagonal
        if(matrizVerificacao[0][0].equals(matrizVerificacao[1][1]) &&
        matrizVerificacao[0][0].equals(matrizVerificacao[2][2]))
        {
            ganhador = true;
        }

        if(matrizVerificacao[2][0].equals(matrizVerificacao[1][1]) &&
        matrizVerificacao[2][0].equals(matrizVerificacao[0][2]))
        {
            ganhador = true;
        }

        return ganhador;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Esconde a barra da tela
        getSupportActionBar().hide();

        //Deixa a tela em fullScreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Chamada dos Botões
        TextView txtJogadorProg = (TextView) findViewById(R.id.txtJogador);

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

        //Chamada do método que inicializa a matriz
        inicializaMatrizVerificacao();


        //-----------Evento de click dos Botões ------------
        btn11Prog.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                /* Coloca o texto que esta dentro da variável do método no botão */
                btn11Prog.setText(jogador);

                //Altera a cor do Botão
                btn11Prog.setBackgroundColor(R.color.cardview_shadow_end_color);

                //Desativa o click do botão
                btn11Prog.setClickable(false);

                //Chamada da matriz de verificação
                matrizVerificacao[0][0] = jogador;

                //Estrutuda de decisão com método que verificaJogador
                if(verificaGanhador())
                {
                    txtJogadorProg.setText("Ganhador: " + jogador);
                    btn11Prog.setClickable(false);
                    btn12Prog.setClickable(false);
                    btn13Prog.setClickable(false);
                    btn21Prog.setClickable(false);
                    btn22Prog.setClickable(false);
                    btn23Prog.setClickable(false);
                    btn31Prog.setClickable(false);
                    btn32Prog.setClickable(false);
                    btn33Prog.setClickable(false);
                }
                else
                    {
                        //Chamada do metodo
                        trocajogador();

                        /* Coloca um texto no txtJogador com o valor armazenado na variavel do metodo */
                        txtJogadorProg.setText("Jogador: "+jogador);

                        //Verifica a variável de empate
                        if(jogadas == 9)
                        {
                            txtJogadorProg.setText("Empate");
                        }
                    }
            }
        });

        btn12Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* Coloca o texto que esta dentro da variável do método no botão */
                btn12Prog.setText(jogador);

                //Altera a cor do Botão
                btn12Prog.setBackgroundColor(R.color.cardview_shadow_end_color);

                //Desativa o click do botão
                btn12Prog.setClickable(false);

                //Chamada da matriz de Verificação
                matrizVerificacao[0][1] = jogador;

                //Estrutuda de decisão com método que verificaJogador
                if(verificaGanhador())
                {
                    txtJogadorProg.setText("Ganhador: "+jogador);
                    btn11Prog.setClickable(false);
                    btn12Prog.setClickable(false);
                    btn13Prog.setClickable(false);
                    btn21Prog.setClickable(false);
                    btn22Prog.setClickable(false);
                    btn23Prog.setClickable(false);
                    btn31Prog.setClickable(false);
                    btn32Prog.setClickable(false);
                    btn33Prog.setClickable(false);
                }
                else
                {
                    //Chamada do metodo
                    trocajogador();

                    /* Coloca um texto no txtJogador com o valor armazenado na variavel do metodo */
                    txtJogadorProg.setText("Jogador: "+jogador);

                    //Verifica a variável de empate
                    if(jogadas == 9)
                    {
                        txtJogadorProg.setText("Empate");
                    }
                }
            }
        });

        btn13Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* Coloca o texto que esta dentro da variável do método no botão */
                btn13Prog.setText(jogador);

                //Altera a cor do Botão
                btn13Prog.setBackgroundColor(R.color.cardview_shadow_end_color);

                //Desativa o click do botão
                btn13Prog.setClickable(false);

                //Chamada da matriz de verificação
                matrizVerificacao[0][2] = jogador;

                //Estrutuda de decisão com método que verificaJogador
                if(verificaGanhador())
                {
                    txtJogadorProg.setText("Ganhador: "+jogador);
                    btn11Prog.setClickable(false);
                    btn12Prog.setClickable(false);
                    btn13Prog.setClickable(false);
                    btn21Prog.setClickable(false);
                    btn22Prog.setClickable(false);
                    btn23Prog.setClickable(false);
                    btn31Prog.setClickable(false);
                    btn32Prog.setClickable(false);
                    btn33Prog.setClickable(false);
                }
                else
                {
                    //Chamada do metodo
                    trocajogador();

                    /* Coloca um texto no txtJogador com o valor armazenado na variavel do metodo */
                    txtJogadorProg.setText("Jogador: "+jogador);

                    //Verifica a variável de empate
                    if(jogadas == 9)
                    {
                        txtJogadorProg.setText("Empate");
                    }
                }
            }
        });

        btn21Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* Coloca o texto que esta dentro da variável do método no botão */
                btn21Prog.setText(jogador);

                //Altera a cor do Botão
                btn21Prog.setBackgroundColor(R.color.cardview_shadow_end_color);

                //Desativa o click do botão
                btn21Prog.setClickable(false);

                //Chamada da matriz de verificação
                matrizVerificacao[1][0] = jogador;

                //Estrutuda de decisão com método que verificaJogador
                if(verificaGanhador())
                {
                    txtJogadorProg.setText("Ganhador: "+jogador);
                    btn11Prog.setClickable(false);
                    btn12Prog.setClickable(false);
                    btn13Prog.setClickable(false);
                    btn21Prog.setClickable(false);
                    btn22Prog.setClickable(false);
                    btn23Prog.setClickable(false);
                    btn31Prog.setClickable(false);
                    btn32Prog.setClickable(false);
                    btn33Prog.setClickable(false);
                }
                else
                {
                    //Chamada do metodo
                    trocajogador();

                    /* Coloca um texto no txtJogador com o valor armazenado na variavel do metodo */
                    txtJogadorProg.setText("Jogador: "+jogador);

                    //Verifica a variável de empate
                    if(jogadas == 9)
                    {
                        txtJogadorProg.setText("Empate");
                    }
                }
            }
        });

        btn22Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* Coloca o texto que esta dentro da variável do método no botão */
                btn22Prog.setText(jogador);

                //Altera a cor do Botão
                btn22Prog.setBackgroundColor(R.color.cardview_shadow_end_color);

                //Desativa o click do botão
                btn22Prog.setClickable(false);

                //Chamada da matriz de verificação
                matrizVerificacao[1][1] = jogador;

                //Estrutuda de decisão com método que verificaJogador
                if(verificaGanhador())
                {
                    txtJogadorProg.setText("Ganhador: "+jogador);
                    btn11Prog.setClickable(false);
                    btn12Prog.setClickable(false);
                    btn13Prog.setClickable(false);
                    btn21Prog.setClickable(false);
                    btn22Prog.setClickable(false);
                    btn23Prog.setClickable(false);
                    btn31Prog.setClickable(false);
                    btn32Prog.setClickable(false);
                    btn33Prog.setClickable(false);
                }
                else
                {
                    //Chamada do metodo
                    trocajogador();

                    /* Coloca um texto no txtJogador com o valor armazenado na variavel do metodo */
                    txtJogadorProg.setText("Jogador: "+jogador);

                    //Verifica a variável de empate
                    if(jogadas == 9)
                    {
                        txtJogadorProg.setText("Empate");
                    }
                }
            }
        });

        btn23Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* Coloca o texto que esta dentro da variável do método no botão */
                btn23Prog.setText(jogador);

                //Altera a cor do Botão
                btn23Prog.setBackgroundColor(R.color.cardview_shadow_end_color);

                //Desativa o click do botão
                btn23Prog.setClickable(false);

                //Chamada da matriz de verificação
                matrizVerificacao[1][2] = jogador;

                //Estrutuda de decisão com método que verificaJogador
                if(verificaGanhador())
                {
                    txtJogadorProg.setText("Ganhador: "+jogador);
                    btn11Prog.setClickable(false);
                    btn12Prog.setClickable(false);
                    btn13Prog.setClickable(false);
                    btn21Prog.setClickable(false);
                    btn22Prog.setClickable(false);
                    btn23Prog.setClickable(false);
                    btn31Prog.setClickable(false);
                    btn32Prog.setClickable(false);
                    btn33Prog.setClickable(false);
                }
                else
                {
                    //Chamada do metodo
                    trocajogador();

                    /* Coloca um texto no txtJogador com o valor armazenado na variavel do metodo */
                    txtJogadorProg.setText("Jogador: "+jogador);

                    //Verifica a variável de empate
                    if(jogadas == 9)
                    {
                        txtJogadorProg.setText("Empate");
                    }
                }
            }
        });

        btn31Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* Coloca o texto que esta dentro da variável do método no botão */
                btn31Prog.setText(jogador);

                //Altera a cor do Botão
                btn31Prog.setBackgroundColor(R.color.cardview_shadow_end_color);

                //Desativa o click do botão
                btn31Prog.setClickable(false);

                //Chamada da matriz de verificação
                matrizVerificacao[2][0] = jogador;

                //Estrutuda de decisão com método que verificaJogador
                if(verificaGanhador())
                {
                    txtJogadorProg.setText("Ganhador: "+jogador);
                    btn11Prog.setClickable(false);
                    btn12Prog.setClickable(false);
                    btn13Prog.setClickable(false);
                    btn21Prog.setClickable(false);
                    btn22Prog.setClickable(false);
                    btn23Prog.setClickable(false);
                    btn31Prog.setClickable(false);
                    btn32Prog.setClickable(false);
                    btn33Prog.setClickable(false);
                }
                else
                {
                    //Chamada do metodo
                    trocajogador();

                    /* Coloca um texto no txtJogador com o valor armazenado na variavel do metodo */
                    txtJogadorProg.setText("Jogador: "+jogador);

                    //Verifica a variável de empate
                    if(jogadas == 9)
                    {
                        txtJogadorProg.setText("Empate");
                    }
                }
            }
        });

        btn32Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* Coloca o texto que esta dentro da variável do método no botão */
                btn32Prog.setText(jogador);

                //Altera a cor do Botão
                btn32Prog.setBackgroundColor(R.color.cardview_shadow_end_color);

                //Desativa o click do botão
                btn32Prog.setClickable(false);

                //Chamada da matriz de verificação
                matrizVerificacao[2][1] = jogador;

                //Estrutuda de decisão com método que verificaJogador
                if(verificaGanhador())
                {
                    txtJogadorProg.setText("Ganhador: "+jogador);
                    btn11Prog.setClickable(false);
                    btn12Prog.setClickable(false);
                    btn13Prog.setClickable(false);
                    btn21Prog.setClickable(false);
                    btn22Prog.setClickable(false);
                    btn23Prog.setClickable(false);
                    btn31Prog.setClickable(false);
                    btn32Prog.setClickable(false);
                    btn33Prog.setClickable(false);
                }
                else
                {
                    //Chamada do metodo
                    trocajogador();

                    /* Coloca um texto no txtJogador com o valor armazenado na variavel do metodo */
                    txtJogadorProg.setText("Jogador: "+jogador);

                    //Verifica a variável de empate
                    if(jogadas == 9)
                    {
                        txtJogadorProg.setText("Empate");
                    }
                }

            }
        });

        btn33Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* Coloca o texto que esta dentro da variável do método no botão */
                btn33Prog.setText(jogador);

                //Altera a cor do Botão
                btn33Prog.setBackgroundColor(R.color.cardview_shadow_end_color);

                //Desativa o click do botão
                btn33Prog.setClickable(false);

                //Chamada da matriz de verificação
                matrizVerificacao[2][2] = jogador;

                //Estrutuda de decisão com método que verificaJogador
                if(verificaGanhador())
                {
                    txtJogadorProg.setText("Ganhador: "+jogador);
                    btn11Prog.setClickable(false);
                    btn12Prog.setClickable(false);
                    btn13Prog.setClickable(false);
                    btn21Prog.setClickable(false);
                    btn22Prog.setClickable(false);
                    btn23Prog.setClickable(false);
                    btn31Prog.setClickable(false);
                    btn32Prog.setClickable(false);
                    btn33Prog.setClickable(false);
                }
                else
                {
                    //Chamada do metodo
                    trocajogador();

                    /* Coloca um texto no txtJogador com o valor armazenado na variavel do metodo */
                    txtJogadorProg.setText("Jogador: "+jogador);

                    //Verifica a variável de empate
                    if(jogadas == 9)
                    {
                        txtJogadorProg.setText("Empate");
                    }
                }
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Gera uma cor aleatória a cada click no btn reset
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));

                /* Em uma visão geral, Esvazia o texto, reativa o click e adiciona uma nova cor */
                btn11Prog.setText("");
                btn11Prog.setClickable(true);
                btn11Prog.setBackgroundColor(color);

                btn12Prog.setText("");
                btn12Prog.setClickable(true);
                btn12Prog.setBackgroundColor(color);

                btn13Prog.setText("");
                btn13Prog.setClickable(true);
                btn13Prog.setBackgroundColor(color);

                btn21Prog.setText("");
                btn21Prog.setClickable(true);
                btn21Prog.setBackgroundColor(color);

                btn22Prog.setText("");
                btn22Prog.setClickable(true);
                btn22Prog.setBackgroundColor(color);

                btn23Prog.setText("");
                btn23Prog.setClickable(true);
                btn23Prog.setBackgroundColor(color);

                btn31Prog.setText("");
                btn31Prog.setClickable(true);
                btn31Prog.setBackgroundColor(color);

                btn32Prog.setText("");
                btn32Prog.setClickable(true);
                btn32Prog.setBackgroundColor(color);

                btn33Prog.setText("");
                btn33Prog.setClickable(true);
                btn33Prog.setBackgroundColor(color);

                /* Reinicializa a matriz de verificacao ao clikar no reset */
                inicializaMatrizVerificacao();

                //Reseta a variável jogador para 0
                jogadas = 0;

                //Reseta o texto do jogador para o ultimo jogador
                txtJogadorProg.setText("Jogador: "+jogador);
                btnReset.setBackgroundColor(color);


            }
        });
    }
}