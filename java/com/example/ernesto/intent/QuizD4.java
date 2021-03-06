package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizD4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_d4);
    }
    @Override
    public void onBackPressed(){
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }

    public void D5(View view) {
        Intent d4 = new Intent(this, QuizD5.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd2_4);
        if (mod.isChecked()) {
            Toast.makeText(QuizD4.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(d4);
        } else {
            Toast.makeText(QuizD4.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(d4);
        }
    }
}

