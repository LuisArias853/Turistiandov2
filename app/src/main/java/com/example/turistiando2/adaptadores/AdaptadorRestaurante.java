package com.example.turistiando2.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.turistiando2.R;
import com.example.turistiando2.moldes.MoldeRestaurante;


import java.util.ArrayList;
public class AdaptadorRestaurante extends RecyclerView.Adapter<AdaptadorRestaurante.viewHolder>{

    //Todos adaptador tine una lista de elementos
    public ArrayList<MoldeRestaurante> listaRestaurantes;

    //creamo un constructor lleno vacio

    public AdaptadorRestaurante() {
    }

    //creamos un constructor lleno
    public AdaptadorRestaurante(ArrayList<MoldeRestaurante> listaRestaurantes) {
        this.listaRestaurantes = listaRestaurantes;
    }

    @NonNull
    @Override
    public AdaptadorRestaurante.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //Esta porcion de codigo permite crear n copias del molde grafico
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.molderestaurantes,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorRestaurante.viewHolder holder, int position) {
        holder.actualizarDatos(listaRestaurantes.get(position));

    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoRestaurante;
        TextView nombreRestaurantes;
        TextView precioRestaurante;
        TextView contactoRestaurante;
        TextView platoRestaurantes;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoRestaurante=itemView.findViewById(R.id.imgrestaurante);
            nombreRestaurantes =itemView.findViewById(R.id.nombrerestaurantes);
            precioRestaurante =itemView.findViewById(R.id.preciosRestaurante);
            contactoRestaurante =itemView.findViewById(R.id.contactolistaRestaurantes);
            platoRestaurantes=itemView.findViewById(R.id.platoRestaurante);
        }

        public  void actualizarDatos(MoldeRestaurante moldeRestaurante) {
            fotoRestaurante.setImageResource(moldeRestaurante.getFoto());
            nombreRestaurantes.setText(moldeRestaurante.getNombre());
            precioRestaurante.setText(moldeRestaurante.getPrecio());
            contactoRestaurante.setText(moldeRestaurante.getTelefono());
            platoRestaurantes.setText(moldeRestaurante.getPlato());
        }
    }
}
