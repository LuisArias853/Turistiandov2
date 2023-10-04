package com.example.turistiando2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.Toast;

import com.example.turistiando2.adaptadores.AdaptadorHoteles;
import com.example.turistiando2.moldes.Moldehotel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    ArrayList<Moldehotel> listaHoteles=new ArrayList<>();
    RecyclerView recyclerView;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerView =findViewById(R.id.listadinamicahoteles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        db.collection("hoteles")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                                String nombreHotel = document.getString("nombre");
                                String precioHotel = document.getString("precio");
                                String telefonoHotel = document.getString("telefono");
                                String descripcionHotel = document.getString("precio");
                                String fotoHotel = document.getString("foto");
                                Toast.makeText(ListaHoteles.this, nombreHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaHoteles.this, precioHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaHoteles.this, telefonoHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaHoteles.this, descripcionHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaHoteles.this, fotoHotel, Toast.LENGTH_SHORT).show();

                            }
                        } else {
                           // Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });

        llenarListaConDactos();
        AdaptadorHoteles adaptadorHoteles=new AdaptadorHoteles(listaHoteles);
        recyclerView.setAdapter(adaptadorHoteles);
    }
    public void llenarListaConDactos(){
        listaHoteles.add(new Moldehotel("Hotel El Cielo", "$150000","Contacto: 32253167897",R.drawable.hotelcomplemento2,R.drawable.hotellista2, "Hotel hermoso y agradable","Calificacion = 5/5"));
        listaHoteles.add(new Moldehotel("Hotel Los Caminos", "$120000","Contacto: 3235386789",R.drawable.hotellista2,R.drawable.compl1 ,"Hotel sucio y desagradable","Calificacion = 3/5"));
        listaHoteles.add(new Moldehotel("Hotel Avenida", "$1380000","Contacto: 396423467897",R.drawable.hotellista3,R.drawable.compl3 ,"Hotel ingreible con vistas inimaginables","Calificacion = 4.5/5"));
        listaHoteles.add(new Moldehotel("Hotel El Descanso", "$200000","Contacto: 35267897787",R.drawable.hotellista4,R.drawable.compl4 ,"Hotel con fallas de logistica y sofocante","Calificacion = 5/5"));
        listaHoteles.add(new Moldehotel("Hotel Manantial", "$180000","Contacto: 31178564321",R.drawable.hotellista5,R.drawable.compl1 ,"Hotel que cumple de buena manara las expectativas de los clientes","Calificacion = 2/5"));
    }
}