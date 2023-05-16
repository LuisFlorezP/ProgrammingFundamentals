package org.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Acá vamos a crear un set con la interface de LinkedHashSet
        Set<Integer> linkedHashSet= new LinkedHashSet<>();

        // El método que nos proporciona Set para insertar datos es el método add
        linkedHashSet.add(1);
        linkedHashSet.add(6);
        linkedHashSet.add(2);

        /* Si queremos imprimir en consola los valores que tenemos hasta el momento lo
        podemos hacer de la siguiente manera */
        System.out.println(linkedHashSet + " datos en el LinkedHashSet");

        // Borramos el elemento que enviemos por parámetro
        linkedHashSet.remove(6);

        /* Imprimimos por consola de nuevo para verificar que si hayamos eliminado el
        elemento ingresado */
        System.out.println(linkedHashSet + " después de hacer remove");

        /* Volvemos a hacer este procedimiento para borrar otro elemento y verificar que se
        haya realizado */
        linkedHashSet.remove(1);
        System.out.println(linkedHashSet + " después de hacer remove");

    }
}