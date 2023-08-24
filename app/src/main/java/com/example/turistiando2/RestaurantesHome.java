package com.example.turistiando2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


    public class RestaurantesHome extends AppCompatActivity {

        Button Restaurantesvermas;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_restaurantes_home);
            Restaurantesvermas=findViewById(R.id.vermasrestaurantes);

            Restaurantesvermas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(com.example.turistiando2.RestaurantesHome.this,listaRestaurantes.class);
                    startActivity(intent);
                }
            });
        }
    }