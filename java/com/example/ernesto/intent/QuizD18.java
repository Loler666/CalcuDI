package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizD18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_d18);
    }
    @Override
    public void onBackPressed(){
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }
    public void D19(View view) {
        Intent d19 = new Intent(this, QuizD19.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd1_4);
        if (mod.isChecked()) {
            Toast.makeText(QuizD18.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(d19);
        } else {
            Toast.makeText(QuizD18.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(d19);
        }
    }

}
