package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizD2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_d2);
    }

    @Override
    public void onBackPressed() {
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }

    public void D3(View view) {
        Intent d3 = new Intent(this, QuizD3.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd2_1);
        if (mod.isChecked()) {
            Toast.makeText(QuizD2.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(d3);
        } else {
            Toast.makeText(QuizD2.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(d3);
        }
    }
}
