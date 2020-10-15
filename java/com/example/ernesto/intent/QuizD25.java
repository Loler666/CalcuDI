package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizD25 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_d25);
    }
    public void onBackPressed(){
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }
    public void Df(View view) {
        Intent df = new Intent(this, FinJuegoD.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd1_1);
        if (mod.isChecked()) {
            Toast.makeText(QuizD25.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(df);
        } else {
            Toast.makeText(QuizD25.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(df);
        }
    }
}
