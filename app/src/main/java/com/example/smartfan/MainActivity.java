package com.example.smartfan;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Aquí iniciamos la actividad siguiente
                Intent intent = new Intent(MainActivity.this, Inicio.class);
                startActivity(intent);
                finish(); // para que el usuario no pueda volver a esta actividad presionando el botón "Atrás"
            }
        }, 3000); // 3000 milisegundos = 3 segundos
    }
}