package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizI12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_i12);
    }
    @Override
    public void onBackPressed(){
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }

    public void I13(View view) {
        Intent i13 = new Intent(this, QuizI13.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd1_1);
        if (mod.isChecked()) {
            Toast.makeText(QuizI12.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(i13);
        } else {
            Toast.makeText(QuizI12.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(i13);
        }
    }
}
