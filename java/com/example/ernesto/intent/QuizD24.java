package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizD24 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_d24);
    }
    public void onBackPressed(){
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }
    public void D25(View view) {
        Intent d25 = new Intent(this, QuizD25.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd1_3);
        if (mod.isChecked()) {
            Toast.makeText(QuizD24.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(d25);
        } else {
            Toast.makeText(QuizD24.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(d25);
        }
    }
}
