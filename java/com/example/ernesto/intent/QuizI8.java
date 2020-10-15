package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizI8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_i8);
    }
    @Override
    public void onBackPressed(){
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }

    public void I9(View view) {
        Intent i9 = new Intent(this, QuizI9.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd1_2);
        if (mod.isChecked()) {
            Toast.makeText(QuizI8.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(i9);
        } else {
            Toast.makeText(QuizI8.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(i9);
        }
    }
}
