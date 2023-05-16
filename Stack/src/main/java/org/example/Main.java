package org.example;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Acá vamos a crear una pila que llenaremos con valores de tipo Integer
        Stack<Integer> pila= new Stack<>();

        // El método que nos proporciona Stack para insertar datos es el método push
        pila.push(1);
        pila.push(2);
        pila.push(3);

        /* Si queremos imprimir en consola los valores que tenemos hasta el momento lo
        podemos hacer de la siguiente manera */
        System.out.println(pila + " datos en la pila");

        // Borramos el último elemento ingresado en la pila por medio del método Pop
        pila.pop();

        /* Imprimimos por consola de nuevo para verificar que si hayamos eliminado el último
        elemento ingresado */
        System.out.println(pila + " después de hacer pop");

        /* Volvemos a hacer este procedimiento para borrar otro elemento y verificar que se
        haya realizado */
        pila.pop();
        System.out.println(pila + " después de hacer pop");
    }
}