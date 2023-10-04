package com.example.turistiando2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.Toast;

import com.example.turistiando2.adaptadores.AdaptatorSitiosTuristicos;
import com.example.turistiando2.moldes.MoldeTurismo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class listaSitiosTuristicos extends AppCompatActivity {

    ArrayList<MoldeTurismo> listaSitiosTuristicos = new ArrayList<>();
    RecyclerView recyclerView;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios_turisticos);
        recyclerView =findViewById(R.id.listadinamicasitiosturisticos);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));

        db.collection("sitios")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                                String nombreSitio = document.getString("nombre");
                                String precioSitio = document.getString("precio");
                                String telefonoSitio = document.getString("telefono");
                                String descripcionSitio = document.getString("precio");
                                String contactoSitio = document.getString("contacto");
                                String fotoSitio = document.getString("foto");
                                Toast.makeText(listaSitiosTuristicos.this, nombreSitio, Toast.LENGTH_SHORT).show();
                                Toast.makeText(listaSitiosTuristicos.this, precioSitio, Toast.LENGTH_SHORT).show();
                                Toast.makeText(listaSitiosTuristicos.this, telefonoSitio, Toast.LENGTH_SHORT).show();
                                Toast.makeText(listaSitiosTuristicos.this, descripcionSitio, Toast.LENGTH_SHORT).show();
                                Toast.makeText(listaSitiosTuristicos.this, contactoSitio, Toast.LENGTH_SHORT).show();
                                Toast.makeText(listaSitiosTuristicos.this, fotoSitio, Toast.LENGTH_SHORT).show();

                            }
                        } else {
                            // Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });

        llenarListaConDactos();
        AdaptatorSitiosTuristicos adaptatorSitiosTuristicos =new AdaptatorSitiosTuristicos(listaSitiosTuristicos);
        recyclerView.setAdapter(adaptatorSitiosTuristicos);
    }
    public void llenarListaConDactos(){
        listaSitiosTuristicos.add(new MoldeTurismo("Museo Cultural", "Emanuel Canno","32253167897","Visita el museo que desmuestra la gran historia cultural de esté maravilloso pueblo","Calificacion = 5/5","Sin costo de visita", R.drawable.lugarlista1,R.drawable.comple9));
        listaSitiosTuristicos.add(new MoldeTurismo("Parque Principal", "Juan Camilo Uribe","351245632","Demostracion religiosa y arquitectonica de la ciudad con gran historia","Calificacion = 1/5","Sin costo de visita", R.drawable.lugarlista2,R.drawable.comple10));
        listaSitiosTuristicos.add(new MoldeTurismo("Iglesia 2da", "Pedro Sarmiento","3147896437","Iglesia que muestra fuerte influecia de la religion en la vida de los Marinillos","Calificacion = 2.5/5","Sin costo de visita", R.drawable.lugarlista3,R.drawable.comple11));
        listaSitiosTuristicos.add(new MoldeTurismo("Monumento a los caidos", "Luis Miguel Arias","3315669889"," Monumento en representación de la lucha por la independencia colombiana","Calificacion = 4.5/5","Sin costo de visita", R.drawable.lugarlista4,R.drawable.comple9));
        listaSitiosTuristicos.add(new MoldeTurismo("Zona Rosa", "Guillermo Paredez","3217046963","Gran muestra de gastronomiay vida nocturna del hermoso pueblo Marinilla. ","Calificacion = 3/5","Sin costo de visita", R.drawable.lugarlista5,R.drawable.comple13));
    }
}