package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizD7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_d7);
    }
    @Override
    public void onBackPressed(){
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }

    public void D8(View view) {
        Intent d8 = new Intent(this, QuizD8.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd2_2);
        if (mod.isChecked()) {
            Toast.makeText(QuizD7.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(d8);
        } else {
            Toast.makeText(QuizD7.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(d8);
        }
    }
}
