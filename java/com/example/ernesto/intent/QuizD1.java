package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizD1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_d1);
    }
    @Override
    public void onBackPressed(){
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }

    public void D2 (View view){
        RadioButton mod = (RadioButton) findViewById(R.id.rd1_3);
        Intent d2 = new Intent(this, QuizD2.class);
        if(mod.isChecked()) {
            Toast.makeText(QuizD1.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(d2);
        }else{
            Toast.makeText(QuizD1.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(d2);
        }

    }
}
