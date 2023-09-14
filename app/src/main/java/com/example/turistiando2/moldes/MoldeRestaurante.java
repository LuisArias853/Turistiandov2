package com.example.turistiando2.moldes;

import java.io.Serializable;

public class MoldeRestaurante implements Serializable {
    private String nombre;
    private String precio;
    private String telefono;
    private String descrpcion;
    private String calificacion;
    private String plato;
    private Integer foto;
    private Integer foto2;


    public MoldeRestaurante() {
    }

    public MoldeRestaurante(String nombre, String precio, String telefono, String descrpcion, String calificacion, String plato, Integer foto, Integer foto2) {
        this.nombre = nombre;
        this.precio = precio;
        this.telefono = telefono;
        this.descrpcion = descrpcion;
        this.calificacion = calificacion;
        this.plato = plato;
        this.foto = foto;
        this.foto2 = foto2;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getDescrpcion() {
        return descrpcion;
    }

    public void setDescrpcion(String descrpcion) {
        this.descrpcion = descrpcion;
    }

    public Integer getFoto2() {
        return foto2;
    }

    public void setFoto2(Integer foto2) {
        this.foto2 = foto2;
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

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

}
