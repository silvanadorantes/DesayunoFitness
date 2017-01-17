package com.example.silvanadorantes.desayunofitness;

/**
 * Created by silvana on 08/03/16.
 */
public class Breakfast {
    private String dia_semana;
    private String nombre;
    private String descripcion;
    private float rating;
    private int imagen;

    public Breakfast(String dia_semana, String nombre, String descripcion, float rating, int imagen){
        this.dia_semana = dia_semana;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.rating = rating;
        this.imagen = imagen;
    }

    public String getDia_semana() {
        return dia_semana;
    }

    public void setDia_semana(String dia_semana) {
        this.dia_semana = dia_semana;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }


}
