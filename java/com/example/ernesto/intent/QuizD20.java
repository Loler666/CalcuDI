package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizD20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_d20);
    }
    public void onBackPressed(){
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }
    public void D21(View view) {
        Intent d21 = new Intent(this, QuizD21.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd1_1);
        if (mod.isChecked()) {
            Toast.makeText(QuizD20.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(d21);
        } else {
            Toast.makeText(QuizD20.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(d21);
        }
    }
}
