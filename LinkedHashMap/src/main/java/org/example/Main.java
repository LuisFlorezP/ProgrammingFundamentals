package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Aca vamos a crear un map con la interface de linkedHashMap
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // El metodo que nos proporciona Map para insertar datos es el metodo put
        linkedHashMap.put(5, "Bogota");
        linkedHashMap.put(6, "Cartagena");
        linkedHashMap.put(3, "Medellin");
        linkedHashMap.put(6, "Cucuta");

        /* Si queremos imprimir en consola los valores que tenemos hasta el momento lo
        podemos hacer de la siguiente manera */
        System.out.println("datos en el LinkedHashMap");
        for (Integer i : linkedHashMap.keySet()) {
            System.out.println(i+ " - "+linkedHashMap.get(i));
        }

        // Borramos el elemento que este con la llave que enviamos de parametro
        linkedHashMap.remove(6);

        /* Imprimimos por consola de nuevo para verificar que si hayamos eliminado el
        elemento ingresado */
        System.out.println("datos en el LinkedHashMap");
        for (Integer i : linkedHashMap.keySet()) {
            System.out.println(i+ " - "+linkedHashMap.get(i));
        }
    }
}