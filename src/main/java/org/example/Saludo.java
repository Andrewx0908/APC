package org.example;

public class Saludo {

        void imprimirSaludo() {
            if (Trabajador.edad < 18) {
                System.out.println("Hola, joven " + Trabajador.nombre);
            } else {
                System.out.println("Hola, señor/a " + Trabajador.nombre);
            }
        }

}
