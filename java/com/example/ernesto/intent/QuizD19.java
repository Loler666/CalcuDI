package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizD19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_d19);
    }
    @Override
    public void onBackPressed(){
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }
    public void D20(View view) {
        Intent d20 = new Intent(this, QuizD20.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd1_3);
        if (mod.isChecked()) {
            Toast.makeText(QuizD19.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(d20);
        } else {
            Toast.makeText(QuizD19.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(d20);
        }
    }

}
