package com.example.agenda09;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ligação dos componentes da classe com a interface.
        EditText edtValor1Prog = (EditText) findViewById(R.id.edtValor1);
        EditText edtValor2Prog = (EditText) findViewById(R.id.edtValor2);
        EditText edtResultadoProg = (EditText) findViewById(R.id.edtResultado);

        Button btnSomarProg = (Button) findViewById(R.id.btnSomar);
        Button btnSubtrairProg = (Button) findViewById(R.id.btnSubtrair);
        Button btnMultiplicarProg = (Button) findViewById(R.id.btnMultiplicar);
        Button btnDividirProg = (Button) findViewById(R.id.btnDividir);
        Button btnLimparProg = (Button) findViewById(R.id.btnLimpar);


        /*Metodo responsavel pela captura do click no botao btnSomar
        e a execucao da acao realizada apos o click */
        btnSomarProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /* Conversão e armazenamento dos caracteres obtidos na interfaco gráfica */

                double num1 = Double.parseDouble(edtValor1Prog.getText().toString());
                double num2 = Double.parseDouble(edtValor2Prog.getText().toString());

                //Soma e armazenamento do resultado.
                double resultado = num1+num2;

                //Retorno do resultado para o usuario na interface grafica.
                edtResultadoProg.setText(String.valueOf(resultado));
            }
        });

        /*Metodo responsavel pela captura do click no botao btnSubtrair
        é a execucao da acao realizada após o click */
        btnSubtrairProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /* Conversão e armazenamento dos caracteres obtidos na interfaco gráfica */
                double num1 = Double.parseDouble(edtValor1Prog.getText().toString());
                double num2 = Double.parseDouble(edtValor2Prog.getText().toString());

                //Subtracao e armazenamento do resultado.
                double resultado = num1-num2;

                //Retorno do resultado para a interface grafica.
                edtResultadoProg.setText(String.valueOf(resultado));
            }
        });

        /*Metodo responsavel pela captura do click no botao btnMultiplicar
        é a execucao da acao realizada após o click */
        btnMultiplicarProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /* Conversão e armazenamento dos caracteres obtidos na interfaco gráfica */
                double num1 = Double.parseDouble(edtValor1Prog.getText().toString());
                double num2 = Double.parseDouble(edtValor2Prog.getText().toString());

                //Multiplicacao e armazenamento do resultado.
                double resultado = num1*num2;

                //Retorno do resultado para a interface grafrica.
                edtResultadoProg.setText(String.valueOf(resultado));
            }
        });

        /*Metodo responsavel pela captura do click no botao btnMultiplicar
        é a execucao da acao realizada após o click */
        btnDividirProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /* Conversão e armazenamento dos caracteres obtidos na interfaco gráfica */
                double num1 = Double.parseDouble(edtValor1Prog.getText().toString());
                double num2 = Double.parseDouble(edtValor2Prog.getText().toString());

                //Divide e armazena o resultado
                double resultado = num1/num2;

                //Retorna o resultado para a interface grafica.
                edtResultadoProg.setText(String.valueOf(resultado));
            }
        });

        /*Metodo responsavel pela captura do click no botao btnLimpar
        é a execucao da acao realizada após o click */
        btnLimparProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Retorna o resultado vazio para a interface grafica.
                edtResultadoProg.setText("");
                edtValor1Prog.setText("");
                edtValor2Prog.setText("");
                edtValor1Prog.requestFocus();
            }
        });
    }
}