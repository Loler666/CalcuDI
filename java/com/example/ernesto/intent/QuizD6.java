package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizD6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_d6);
    }
    @Override
    public void onBackPressed(){
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }

    public void D7(View view) {
        Intent d7 = new Intent(this, QuizD7.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd2_3);
        if (mod.isChecked()) {
            Toast.makeText(QuizD6.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(d7);
        } else {
            Toast.makeText(QuizD6.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(d7);
        }
    }
}
