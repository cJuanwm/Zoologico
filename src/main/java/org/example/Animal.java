package org.example;

public class Animal {

    private String nombre;
    private String genero;
    private double peso;
    private Animal pareja;


    public Animal(String nombre, String genero, double peso) {
        this.nombre = nombre;
        this.genero = genero;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void encontrarPareja(Animal pareja) {
        this.pareja = pareja;
    }


}
