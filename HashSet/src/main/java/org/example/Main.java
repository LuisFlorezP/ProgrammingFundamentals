package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Acá vamos a crear un set con la interfaz de HashSet
        Set<Integer> hashSet= new HashSet<>();

        // El método que nos proporciona Set para insertar datos es el método add
        hashSet.add(1);
        hashSet.add(6);
        hashSet.add(2);

        /* Si queremos imprimir en consola los valores que tenemos hasta el momento lo
        podemos hacer de la siguiente manera */
        System.out.println(hashSet + " datos en el HashSet");

        // Borramos el elemento que enviemos por parámetro
        hashSet.remove(6);

        /* Imprimimos por consola de nuevo para verificar que si hayamos eliminado el
        elemento ingresado */
        System.out.println(hashSet + " después de hacer remove");

        /* Volvemos a hacer este procedimiento para borrar otro elemento y verificar que se
        haya realizado */
        hashSet.remove(1);
        System.out.println(hashSet + " después de hacer remove");
    }
}