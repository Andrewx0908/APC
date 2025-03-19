package org.example;

public class Bono {
    void calcularBono() {
        double bono = 0;
        if (Trabajador.edad > 50) {
            bono = Trabajador.salario * 0.10;
        } else {
            bono = Trabajador.salario * 0.05;
        }
        System.out.println("Bono: " + bono);
    }
}
