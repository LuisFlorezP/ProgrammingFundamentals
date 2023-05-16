package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creando un objeto ArrayList de tipo String
        ArrayList<String> a1 = new ArrayList<>();

        // Adicionando elementos al ArrayList
        a1.add("Car");
        a1.add("Bus");

        // Agregar con un índice en específico
        a1.add(1, "Motorcycle");

        // Mostrar los elementos del ArrayList
        System.out.println("ArrayList inicial: " + a1);

        // Modificar el elemento de la posición indicada
        a1.set(1, "Cycle");

        // Mostrar los elementos actualizados del ArrayList
        System.out.println("ArrayList modificado: " + a1);
    }
}