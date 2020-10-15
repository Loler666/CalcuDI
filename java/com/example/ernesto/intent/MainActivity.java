package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Método el botón Siguiente
    public void Siguiete(View view){
        Intent siguiente = new Intent(this, Formulario.class);
        startActivity(siguiente);
    }
    public void Iniciar(View view){
        RadioButton mod = (RadioButton) findViewById(R.id.Diferencial);
        if(mod.isChecked()) {
            Intent iniciarD = new Intent(this, QuizD1.class);
            startActivity(iniciarD);
        }else{
            Intent iniciarI = new Intent(this, QuizI1.class);
            startActivity(iniciarI);
        }
    }
}
