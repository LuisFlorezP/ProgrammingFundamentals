package org.example;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Acá vamos a crear un set con la interface de TreeSet
        Set<Integer> treeSet= new TreeSet<>();

        // El método que nos proporciona Set para insertar datos es el método add
        treeSet.add(1);
        treeSet.add(6);
        treeSet.add(2);

        /* Si queremos imprimir en consola los valores que tenemos hasta el momento lo
        podemos hacer de la siguiente manera */
        System.out.println(treeSet + " datos en el TreeSet");

        // Borramos el elemento que enviemos por parámetro
        treeSet.remove(6);

        /* Imprimimos por consola de nuevo para verificar que si hayamos eliminado el
        elemento ingresado */
        System.out.println(treeSet + " después de hacer remove");

        /* Volvemos a hacer este procedimiento para borrar otro elemento y verificar que se
        haya realizado */
        treeSet.remove(1);
        System.out.println(treeSet + " después de hacer remove");
    }
}