package com.example.turistiando2.moldes;

import java.io.Serializable;

public class MoldeTurismo implements Serializable {
    private String nombre;
    private String contacto;
    private String telefono;
    private String descrpcion;
    private String calificacion;
    private String precio;
    private Integer foto;
    private Integer foto2;


    public MoldeTurismo() {
    }

    public MoldeTurismo(String nombre, String contacto, String telefono, String descrpcion, String calificacion, String precio, Integer foto, Integer foto2) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.telefono = telefono;
        this.descrpcion = descrpcion;
        this.calificacion = calificacion;
        this.precio = precio;
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

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }
}
