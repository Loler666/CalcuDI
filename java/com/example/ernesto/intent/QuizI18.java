package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizI18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_i18);
    }
    @Override
    public void onBackPressed(){
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }

    public void I19(View view) {
        Intent i19 = new Intent(this, QuizI19.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd1_3);
        if (mod.isChecked()) {
            Toast.makeText(QuizI18.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(i19);
        } else {
            Toast.makeText(QuizI18.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(i19);
        }
    }
}
