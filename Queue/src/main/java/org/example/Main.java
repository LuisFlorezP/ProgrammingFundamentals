package org.example;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Aca vamos a crear una cola que llenaremos con valores de tipo Integer
        Queue<Integer> cola= new PriorityQueue<>();

        // El método que nos proporciona Queue para insertar datos es el método add
        cola.add(1);
        cola.add(2);
        cola.add(3);

        /* Si queremos imprimir en consola los valores que tenemos hasta el momento lo
        podemos hacer de la siguiente manera */
        System.out.println(cola + " datos en la cola");

        // Borramos el primer elemento ingresado en la cola por medio del método remove
        cola.remove();

        /* Imprimimos por consola de nuevo para verificar que si hayamos eliminado el
        primer elemento ingresado */
        System.out.println(cola + " después de hacer remove");

        /* Volvemos a hacer este procedimiento para borrar otro elemento y verificar que se
        haya realizado */
        cola.remove();
        System.out.println(cola + " después de hacer remove");
    }
}