package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizD16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_d16);
    }
    @Override
    public void onBackPressed(){
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }
    public void D17(View view) {
        Intent d17 = new Intent(this, QuizD17.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd1_3);
        if (mod.isChecked()) {
            Toast.makeText(QuizD16.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(d17);
        } else {
            Toast.makeText(QuizD16.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(d17);
        }
    }

}
