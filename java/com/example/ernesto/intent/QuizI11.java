package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizI11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_i11);
    }
    @Override
    public void onBackPressed(){
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }

    public void I12(View view) {
        Intent i12 = new Intent(this, QuizI12.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd1_4);
        if (mod.isChecked()) {
            Toast.makeText(QuizI11.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(i12);
        } else {
            Toast.makeText(QuizI11.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(i12);
        }
    }
}
