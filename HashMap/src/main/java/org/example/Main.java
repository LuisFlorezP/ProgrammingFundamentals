package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Acá vamos a crear un map con la interface de hashMap
        Map<Integer, String> hashMap = new HashMap<>();

        // El método que nos proporciona Map para insertar datos es el método put
        hashMap.put(5, "Bogota");
        hashMap.put(6, "Cartagena");
        hashMap.put(3, "Medellin");
        hashMap.put(6, "Cucuta");

        /* Si queremos imprimir en consola los valores que tenemos hasta el momento lo
        podemos hacer de la siguiente manera */
        System.out.println("datos en el HashMap");
        for (Integer i : hashMap.keySet()) {
            System.out.println(i+ " - "+hashMap.get(i));
        }

        // Borramos el elemento que este con la llave que enviamos de parametro
        hashMap.remove(6);

        /* Imprimimos por consola de nuevo para verificar que si hayamos eliminado el
        elemento ingresado */
        System.out.println("datos en el HashMap");
        for (Integer i : hashMap.keySet()) {
            System.out.println(i+ " - "+hashMap.get(i));
        }
    }
}