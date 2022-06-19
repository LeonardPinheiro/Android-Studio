package com.example.luximetro;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SensorManager sensorManager;
    private Sensor sensor;
    private SensorEventListener sensorEventListner;

    float maiorValor = 0, menorValor = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtMaiorValorProg = (TextView) findViewById(R.id.txtMaiorValor);
        TextView txtMenorValorProg = (TextView) findViewById(R.id.txtMenorValor);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);

        if(sensor == null){
            Toast.makeText(this, "O dispositivo não possui sensor de luz!", Toast.LENGTH_SHORT).show();
            finish();
        }

        sensorEventListner = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                float value = sensorEvent.values[0];
                TextView txtResultadoProg = (TextView) findViewById(R.id.txtResultado);
                txtResultadoProg.setText("Luminosidade: "+value + " lx");

                for(int i = 0; i < sensorEvent.values.length; i++){
                    if(sensorEvent.values[i] > maiorValor){
                        maiorValor = sensorEvent.values[i];
                    }else if(sensorEvent.values[i] > menorValor){
                        menorValor = sensorEvent.values[i];
                    }
                }

                txtMaiorValorProg.setText("Maior Luminosidade: " + maiorValor + " lx");
                txtMenorValorProg.setText("Menor Luminosidade: " + menorValor + " lx");

            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int accuracy) {

            }

        };

    }

    @Override
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(sensorEventListner, sensor, SensorManager.SENSOR_DELAY_FASTEST);
    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(sensorEventListner);
    }
}