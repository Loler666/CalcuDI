package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizI7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_i7);
    }
    @Override
    public void onBackPressed(){
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }

    public void I8(View view) {
        Intent i8 = new Intent(this, QuizI8.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd1_1);
        if (mod.isChecked()) {
            Toast.makeText(QuizI7.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(i8);
        } else {
            Toast.makeText(QuizI7.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(i8);
        }
    }
}
