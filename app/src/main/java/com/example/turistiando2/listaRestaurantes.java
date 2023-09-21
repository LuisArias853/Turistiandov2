package com.example.turistiando2;


import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.turistiando2.adaptadores.AdaptadorRestaurante;
import com.example.turistiando2.moldes.MoldeRestaurante;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class listaRestaurantes extends AppCompatActivity {
    ArrayList<MoldeRestaurante> listaRestaurantes = new ArrayList<>();
    RecyclerView recyclerView;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);
        recyclerView =findViewById(R.id.listadinamicarestaurantes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));

        db.collection("restaurantes")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                                String nombreRestaurante = document.getString("nombre");
                                String precioRestaurante = document.getString("precio");
                                String telefonoRestaurante = document.getString("telefono");
                                String platoRestaurante = document.getString("plato");
                                String fotoRestaurante = document.getString("foto");
                                Toast.makeText(listaRestaurantes.this, nombreRestaurante, Toast.LENGTH_SHORT).show();

                            }
                        } else {
                            // Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });

        llenarListaConDactos();
        AdaptadorRestaurante adaptadorRestaurante =new AdaptadorRestaurante(listaRestaurantes);
        recyclerView.setAdapter(adaptadorRestaurante);
    }
    public void llenarListaConDactos(){
        listaRestaurantes.add(new MoldeRestaurante("Restaurante Con tradicion", "12000 COP","32253167897"," Este restaurante tiene las mejores Arepas de queso","Calificacion = 3.5/5", "Arepas de queso",R.drawable.comida1,R.drawable.comple6));
        listaRestaurantes.add(new MoldeRestaurante("Restaurante Doña Gloria", "10000 COP","32253167897","Este restaurante se destaca por Arepas de Mote","Calificacion = 1/5","Arepas de Mote",R.drawable.comida2,R.drawable.comple7));
        listaRestaurantes.add(new MoldeRestaurante("Restaurante Antioqueño de corazón", "19000 COP","32253167897"," Este restaurante es famoso por su Entrada Familiar","Calificacion = 5/5","Entrada Familiar", R.drawable.comida3,R.drawable.comple8));
        listaRestaurantes.add(new MoldeRestaurante("Restaurante El molino", "6000 COP","32253167897","Este restaurante tiene como pronipal sus Empanadas","Calificacion = 5/5","Empanadas",R.drawable.comida4,R.drawable.comple6));
        listaRestaurantes.add(new MoldeRestaurante("Restaurante El Asadero", "350000 COP","32253167897","Aquí encontraras delicias como  estás Costillas BBQ","Calificacion = 3.5/5","Costillas BBQ",R.drawable.comida5,R.drawable.comple8));
    }

    }
