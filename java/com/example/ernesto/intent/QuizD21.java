package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizD21 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_d21);
    }
    public void onBackPressed(){
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }
    public void D22(View view) {
        Intent d22 = new Intent(this, QuizD22.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd1_3);
        if (mod.isChecked()) {
            Toast.makeText(QuizD21.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(d22);
        } else {
            Toast.makeText(QuizD21.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(d22);
        }
    }
}
