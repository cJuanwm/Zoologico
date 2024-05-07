package org.example;

public class Zoologico {
    public static void main(String[] args) {


        Animal animal1 = new Animal("Cebra", "F", 10);


        Animal animal2 = new Animal("Caballo", "M", 15);


        animal1.encontrarPareja(animal2); //Un animal consigue pareja


        Familia familia = new Familia(animal1, animal2);


        familia.tenerHijo("Cebrallo");


        familia.imprimirFamilia();


    }
}