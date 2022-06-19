package com.example.agenda12;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Botao e editText
     EditText edtNomeProg;
     EditText edtTelefoneProg;
     EditText edtEmailProg;
     Button btnSalvarProg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Armazenando o tipo no EditText e no botao
         btnSalvarProg = (Button) findViewById(R.id.btnSalvar);
          edtNomeProg = (EditText) findViewById(R.id.edtNome);
          edtTelefoneProg = (EditText) findViewById(R.id.edtTelefone);
          edtEmailProg = (EditText) findViewById(R.id.edtEmail);

          //Adicionando um evento ao click
        btnSalvarProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Desenvolvimento do modelo de alertDialogo
                AlertDialog.Builder modelo = new AlertDialog.Builder(MainActivity.this);

                //Define o titulo para o alertDialogo
                modelo.setTitle("Cadastro");

                //Define a mensagem para o alert dialog
                modelo.setMessage("Nome: " + edtNomeProg.getText() + "\nTelefone: " + edtTelefoneProg.getText() + "\nEmail: "
                + edtEmailProg.getText());

                //Define um botao para o alertDialog
                modelo.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //Define oque é feito quando o usuário clickar no botao ok
                        finish();
                    }
                });

                //Cria um alert com base no modelo criado antes
                AlertDialog alert = modelo.create();

                //Mostra o AlertDialog na tela
                alert.show();
            }
        });

    }
}