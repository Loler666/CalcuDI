package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FinJuegoD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fin_juego_d);
    }
    public void inicio (View view){
        Intent ini = new Intent(this, MainActivity.class);
        startActivity(ini);
    }
    public void Siguiete(View view){
        Intent siguiente = new Intent(this, Formulario.class);
        startActivity(siguiente);
    }
    public void Creditos(View view){
        Intent creditos = new Intent(this, Creditos.class);
        startActivity(creditos);
    }
}
