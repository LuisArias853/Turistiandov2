package com.example.turistiando2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class
LoginActivity extends AppCompatActivity {


    //atributos de la clase
    EditText cajaNombreUsuario;
    EditText cajaContrasena;
    Button botonIngreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        cajaNombreUsuario = findViewById(R.id.usuario);
        cajaContrasena = findViewById(R.id.contraseña);
        botonIngreso = findViewById(R.id.botonIngresar);

        botonIngreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //capturando dato de las cajas
                String nombreUsuario = cajaNombreUsuario.getText().toString();
                String passwordUsuario = cajaContrasena.getText().toString();

                Intent intent=new Intent(LoginActivity.this,Home.class);

                intent.putExtra("nombre",nombreUsuario);
                intent.putExtra("password",nombreUsuario);

                startActivity(intent);
            }
        });

        }
}