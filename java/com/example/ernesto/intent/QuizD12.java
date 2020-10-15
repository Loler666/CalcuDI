package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizD12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_d12);
    }
    @Override
    public void onBackPressed(){
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }
    public void D13(View view) {
        Intent d13 = new Intent(this, QuizD13.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd1_1);
        if (mod.isChecked()) {
            Toast.makeText(QuizD12.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(d13);
        } else {
            Toast.makeText(QuizD12.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(d13);
        }
    }
}
