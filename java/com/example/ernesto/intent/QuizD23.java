package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizD23 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_d23);
    }
    public void onBackPressed(){
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }
    public void D24(View view) {
        Intent d24 = new Intent(this, QuizD24.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd1_4);
        if (mod.isChecked()) {
            Toast.makeText(QuizD23.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(d24);
        } else {
            Toast.makeText(QuizD23.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(d24);
        }
    }
}
