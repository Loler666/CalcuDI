package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizI23 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_i23);
    }
    @Override
    public void onBackPressed(){
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }

    public void I24(View view) {
        Intent i24 = new Intent(this, QuizI24.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd1_3);
        if (mod.isChecked()) {
            Toast.makeText(QuizI23.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(i24);
        } else {
            Toast.makeText(QuizI23.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(i24);
        }
    }
}
