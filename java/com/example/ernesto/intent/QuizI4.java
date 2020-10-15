package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizI4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_i4);
    }
    @Override
    public void onBackPressed(){
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }

    public void I5(View view) {
        Intent i5 = new Intent(this, QuizI5.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd1_2);
        if (mod.isChecked()) {
            Toast.makeText(QuizI4.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(i5);
        } else {
            Toast.makeText(QuizI4.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(i5);
        }
    }
}
