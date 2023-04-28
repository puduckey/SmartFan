package com.example.smartfan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Configuracion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);
    }

    public void irPantallaSincronizacion(View v){
        Intent i = new Intent(Configuracion.this, Sincronizacion.class);
        startActivity(i);
    }
}