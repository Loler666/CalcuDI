package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizI22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_i22);
    }    @Override
    public void onBackPressed(){
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }

    public void I23(View view) {
        Intent i23 = new Intent(this, QuizI23.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd1_2);
        if (mod.isChecked()) {
            Toast.makeText(QuizI22.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(i23);
        } else {
            Toast.makeText(QuizI22.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(i23);
        }
    }
}
