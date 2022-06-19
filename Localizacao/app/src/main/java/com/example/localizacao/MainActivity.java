package com.example.localizacao;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btnGerarGpsProg;
    TextView txtLatitudeProg, txtLongitudeProg, txtAltitudeProg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLatitudeProg = (TextView) findViewById(R.id.txtLatitude);
        txtLongitudeProg = (TextView) findViewById(R.id.txtLongitude);
        txtAltitudeProg = (TextView) findViewById(R.id.txtAltitude);

        btnGerarGpsProg = (Button) findViewById(R.id.btnGPS);

        btnGerarGpsProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solicitarPermissao();
            }
        });
    }

    private void solicitarPermissao(){
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
        && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
        }else{
            ativarServicoGPS();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {

        switch (requestCode){
            case 1: {
                if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    ativarServicoGPS();
                }else{
                    Toast.makeText(this, "Sem Conexão com o GPS!", Toast.LENGTH_SHORT).show();
                }
                return;
            }
        }
    }

    public void ativarServicoGPS(){
        try {
            LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);


            LocationListener locationListener = new LocationListener(){

                @Override
                public void onLocationChanged(Location locations) {escreverLocalizacao(locations);}

                @Override
                public void onStatusChanged(String provider, int status, Bundle extras) { }

                @Override
                public void onProviderEnabled(String provider) { }

                @Override
                public void onProviderDisabled(String provider) { }
            };
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
        }catch (SecurityException ex){
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void escreverLocalizacao(Location location){
        Double longitude =  location.getLongitude();
        Double latitude = location.getLatitude();
        Double Altitude = location.getAltitude();

        txtLongitudeProg.setText(longitude.toString());
        txtLatitudeProg.setText(latitude.toString());
        txtAltitudeProg.setText(Altitude.toString()+ "m");
    }
}