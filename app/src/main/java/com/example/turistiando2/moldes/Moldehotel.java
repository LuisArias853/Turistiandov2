package com.example.turistiando2.moldes;

import java.io.Serializable;

public class Moldehotel implements Serializable {

    private String nombre;
    private String precio;
    private String telefono;
    private Integer foto;
    private Integer foto2;
    private String descripcion;
    private String calificacion;


    public Moldehotel() {//constructor vacio
    }

    public Moldehotel(String nombre, String precio, String telefono, Integer foto, Integer foto2, String descripcion, String calificacion) {
        this.nombre = nombre;
        this.precio = precio;
        this.telefono = telefono;
        this.foto = foto;
        this.foto2 = foto2;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public Integer getFoto2() {
        return foto2;
    }

    public void setFoto2(Integer foto2) {
        this.foto2 = foto2;
    }
}
