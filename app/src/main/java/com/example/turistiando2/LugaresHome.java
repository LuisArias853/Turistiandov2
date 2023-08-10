package com.example.turistiando2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LugaresHome extends AppCompatActivity {
    Button lugaresvermas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugares_home);
        lugaresvermas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LugaresHome.this,listaSitiosTuristicos.class);
                startActivity(intent);
            }
        });
    }
}