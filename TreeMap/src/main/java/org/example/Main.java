package org.example;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Aca vamos a crear un map con la interface de treeMap
        Map<Integer, String> treeMap = new TreeMap<>();

        // El metodo que nos proporciona Map para insertar datos es el metodo put
        treeMap.put(5, "Bogota");
        treeMap.put(6, "Cartagena");
        treeMap.put(3, "Medellin");
        treeMap.put(6, "Cucuta");

        /* Si queremos imprimir en consola los valores que tenemos hasta el momento lo
        podemos hacer de la siguiente manera */
        System.out.println("datos en el TreeMap");
        for (Integer i : treeMap.keySet()) {
            System.out.println(i+ " - "+treeMap.get(i));
        }

        // Borramos el elemento que este con la llave que enviamos de parametro
        treeMap.remove(6);

        /* Imprimimos por consola de nuevo para verificar que si hayamos eliminado el
        elemento ingresado */
        System.out.println("datos en el TreeMap");
        for (Integer i : treeMap.keySet()) {
            System.out.println(i+ " - "+treeMap.get(i));
        }
    }
}