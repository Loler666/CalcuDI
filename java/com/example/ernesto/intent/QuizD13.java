package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizD13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_d13);
    }
    @Override
    public void onBackPressed(){
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }
    public void D14(View view) {
        Intent d14 = new Intent(this, QuizD14.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd1_4);
        if (mod.isChecked()) {
            Toast.makeText(QuizD13.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(d14);
        } else {
            Toast.makeText(QuizD13.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(d14);
        }
    }

}
