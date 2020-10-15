package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizD11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_d11);
    }
    @Override
    public void onBackPressed(){
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }
    public void D12(View view) {
        Intent d12 = new Intent(this, QuizD12.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd1_4);
        if (mod.isChecked()) {
            Toast.makeText(QuizD11.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(d12);
        } else {
            Toast.makeText(QuizD11.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(d12);
        }
    }
}