package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizI14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_i14);
    }
    @Override
    public void onBackPressed(){
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }

    public void I15(View view) {
        Intent i15 = new Intent(this, QuizI15.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd1_1);
        if (mod.isChecked()) {
            Toast.makeText(QuizI14.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(i15);
        } else {
            Toast.makeText(QuizI14.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(i15);
        }
    }
}
