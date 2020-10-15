package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizD10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_d10);
    }
    @Override
    public void onBackPressed(){
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }
    public void D11(View view) {
        Intent d11 = new Intent(this, QuizD11.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd1_2);
        if (mod.isChecked()) {
            Toast.makeText(QuizD10.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(d11);
        } else {
            Toast.makeText(QuizD10.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(d11);
        }
    }
}
