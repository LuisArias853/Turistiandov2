package com.example.turistiando2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HotelesHome extends AppCompatActivity {

        Button hotelvermas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles_home);
        hotelvermas=findViewById(R.id.hotelvermas);

        hotelvermas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelesHome.this,ListaHoteles.class);
                startActivity(intent);
            }
        });
    }
}