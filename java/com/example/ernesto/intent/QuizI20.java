package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizI20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_i20);
    }
    @Override
    public void onBackPressed(){
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }

    public void I21(View view) {
        Intent i21 = new Intent(this, QuizI21.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd1_1);
        if (mod.isChecked()) {
            Toast.makeText(QuizI20.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(i21);
        } else {
            Toast.makeText(QuizI20.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(i21);
        }
    }
}
