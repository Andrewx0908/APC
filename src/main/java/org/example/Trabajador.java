package org.example;

public class Trabajador {
    static String nombre = "SinNombre";
    static int edad = 0;
    static double salario = 0.0;

    public static void datos(String n, int e, double s) {
        nombre = n;
        edad = e;
        salario = s;
    }

    public static void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
}
