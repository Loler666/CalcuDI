package com.example.ernesto.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizI25 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_i25);
    }
    public void onBackPressed(){
        //En caso de querer permitir volver atrás usa esta llamada:
        //super.onBackPressed();
    }
    public void Ifi(View view) {
        Intent ifi = new Intent(this, FinJuegoI.class);
        RadioButton mod = (RadioButton) findViewById(R.id.rd1_4);
        if (mod.isChecked()) {
            Toast.makeText(QuizI25.this, "Correcto", Toast.LENGTH_SHORT).show();
            startActivity(ifi);
        } else {
            Toast.makeText(QuizI25.this, "Inorrecto", Toast.LENGTH_SHORT).show();
            startActivity(ifi);
        }
    }
}
