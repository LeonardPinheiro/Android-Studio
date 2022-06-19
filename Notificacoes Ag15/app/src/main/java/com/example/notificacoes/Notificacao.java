package com.example.notificacoes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Notificacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificacao);

        //Chamada do botão
        Button btnNotificarProg = (Button) findViewById(R.id.btnNotificacao);
        Button btnNotificar2Prog = (Button) findViewById(R.id.btnNotificacao2);

        //Evento de click
        btnNotificarProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              String mensagem = "Desconto de 70%";
              String titulo = "Deu a Louca no Gerente - Mega Promoção";

              //método utilizado para chamar mensagem e titulo
              notificarUsuario(mensagem, titulo);
            }
            //Método notifica usuário
            //Parametro do tipo texto: mensagem e tutulo
            public void notificarUsuario(String mensagem, String titulo){

                //Objeto notificacao para receber os parametro e construir a estrutura
                NotificationCompat.Builder notificacao = new NotificationCompat.Builder(getBaseContext());

                //Construindo o titulo da notificação
                notificacao.setContentTitle(titulo);

                //Construindo a mensagem da notificação
                notificacao.setContentText(mensagem);

                //Construindo a prioridade da notificação
                notificacao.setPriority(Notification.PRIORITY_HIGH);

                //Construindo o icone da notificação
                notificacao.setSmallIcon(R.drawable.icone);

                /* Quando o usuário clicar na notificação, exclui a notificação da gaveta de notificação */
                notificacao.setAutoCancel(true);

                //Quando o usuário clicar invia ele para a tela de promoção
                Intent it = new Intent(getBaseContext(), Promocao.class);

                /* Utilizando o Pending Intent para que o Android consiga executar a activity do projeto */
                PendingIntent pit = PendingIntent.getActivity(getBaseContext(), 100, it, PendingIntent.FLAG_UPDATE_CURRENT);

                /* Atribuindo na notificação a intenção que sera executada quando o usuário clicar */
                notificacao.setContentIntent(pit);

                //Criando o objeto para gerenciar e gerar a notificação no Android
                NotificationManager notificar = (NotificationManager)
                        getBaseContext().getSystemService(Context.NOTIFICATION_SERVICE);

                //Executando a notificação com id fixo:(9000)
                notificar.notify(9000, notificacao.build());

            }
        });

        //Evento de click botão 2
        btnNotificar2Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String mensagem = "Desconto de 50%";
                String titulo = "Camisa em Promoção venha conferir";

                notificarUsuario2(mensagem, titulo);
            }

            //Método notifica usuário
            //Parametro do tipo texto: mensagem e tutulo
            public void notificarUsuario2(String mensagem, String titulo){

                //Objeto notificacao para receber os parametro e construir a estrutura
                NotificationCompat.Builder notificacao2 = new NotificationCompat.Builder(getBaseContext());

                //Construindo o titulo da notificação
                notificacao2.setContentTitle(titulo);

                //Construindo a mensagem da notificação
                notificacao2.setContentText(mensagem);

                //Construindo a prioridade da notificação
                notificacao2.setPriority(Notification.PRIORITY_HIGH);

                //Construindo o icone da notificação
                notificacao2.setSmallIcon(R.drawable.icone);

                /* Quando o usuário clicar na notificação, exclui a notificação da gaveta de notificação */
                notificacao2.setAutoCancel(true);

                //Quando o usuário clicar invia ele para a tela de promoção2
                Intent it = new Intent(getBaseContext(), Promocao2.class);

                /* Utilizando o Pending Intent para que o Android consiga executar a activity do projeto */
                PendingIntent pit = PendingIntent.getActivity(getBaseContext(), 100,
                        it, PendingIntent.FLAG_UPDATE_CURRENT);

                /* Atribuindo na notificação a intenção que sera executada quando o usuário clicar */
                notificacao2.setContentIntent(pit);

                //Criando o objeto para gerenciar e gerar a notificação no Android
                NotificationManager notificar2 = (NotificationManager)
                        getBaseContext().getSystemService(Context.NOTIFICATION_SERVICE);

                //Executando a notificação com id fixo:(9000)
                notificar2.notify(9001, notificacao2.build());
            }
        });

    }

}