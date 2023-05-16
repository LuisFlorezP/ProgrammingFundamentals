package org.example;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Crear objeto de la clase LinkedList
        LinkedList<String> a1 = new LinkedList<>();

        // Adicionar elementos a la LinkedList
        a1.add("A");
        a1.add("B");
        a1.addLast("C");
        a1.addFirst("D");
        a1.add(2, "E");

        // Mostrar la LinkedList inicial
        System.out.println(a1);

        // Eliminar elementos a la LinkedList
        a1.remove("B");
        a1.remove(3);
        a1.removeFirst();
        a1.removeLast();

        // Mostrar la LinkedList actualizada
        System.out.println(a1);
    }
}