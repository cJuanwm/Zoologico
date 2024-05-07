package org.example;

public class Familia {
    private Animal papa;
    private Animal mama;
    private Animal hijo;

    public Familia(Animal papa, Animal mama) {
        this.papa = papa;
        this.mama = mama;
    }

    public void imprimirFamilia() {

        //Este metodo muestra los nombres de los integrantes de la familia
        System.out.println(
                "El papá es: " + this.papa.getNombre() +
                        "\nLa mamá es: " + this.mama.getNombre() +
                        "\nEl hijo es: " + this.hijo.getNombre()
        );

    }

    public void tenerHijo(String nombre) {
        if (this.papa != null) {
            double random = Math.random();
            if (random < 0.5) {
                Animal hijo = new Animal(nombre, "M", 1);
                this.hijo = hijo;
            } else {
                Animal hijo = new Animal(nombre, "F", 1);
                this.hijo = hijo;
            }
        } else {
            System.out.println("Aun no puedes tener hijos");
        }


    }


}
