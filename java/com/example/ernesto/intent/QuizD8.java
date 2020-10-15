package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizD8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_d8);
    }
    @Override
    public void onBackPressed(){
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }

    public void D9(View view) {
        Intent d9 = new Intent(this, QuizD9.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd2_2);
        if (mod.isChecked()) {
            Toast.makeText(QuizD8.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(d9);
        } else {
            Toast.makeText(QuizD8.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(d9);
        }
    }
}
