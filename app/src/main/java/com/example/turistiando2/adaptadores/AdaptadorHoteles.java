package com.example.turistiando2.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.turistiando2.R;
import com.example.turistiando2.moldes.Moldehotel;

import java.util.ArrayList;

public class AdaptadorHoteles extends RecyclerView.Adapter<AdaptadorHoteles.viewHolder> {

    //Todos adaptador tine una lista de elementos
    public ArrayList<Moldehotel> listaHoteles;

    //creamo un constructor lleno vacio

    public AdaptadorHoteles() {
    }


    //creamos un constructor lleno


    public AdaptadorHoteles(ArrayList<Moldehotel> listaHoteles) {
        this.listaHoteles = listaHoteles;
    }

    @NonNull
    @Override
    public AdaptadorHoteles.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //Esta porcion de codigo permite crear n copias del molde grafico
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.moldehotel,null,false);
        return new parent(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorHoteles.viewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
