package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Prueba 1");
        System.out.println("Prueba 2");
        System.out.println("NO PEPE");
        mensaje("hola", "adios");
    }

    /**
     * Muestra por consola un mensaje con los parametros otrogados.
     * @param a Parametro de un string para imprimir
     * @param b Otro parametro de un string para imprimir
     */

    public static void mensaje(String a, String b) {
        System.out.println(a + " " + b);
    }

}
