package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizI2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_i2);
    }

    @Override
    public void onBackPressed() {
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }

    public void I3(View view) {
        Intent i3 = new Intent(this, QuizI3.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd1_2);
        if (mod.isChecked()) {
            Toast.makeText(QuizI2.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(i3);
        } else {
            Toast.makeText(QuizI2.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(i3);
        }
    }
}
