package org.example;

public class Main2 {

        public static void main(String[] args) {
            Trabajador.datos("Juan Perez", 45, 50000);
            Trabajador.mostrar();
            Bono bono = new Bono();
            bono.calcularBono();
            Saludo saludo = new Saludo();
            saludo.imprimirSaludo();
        }

}
