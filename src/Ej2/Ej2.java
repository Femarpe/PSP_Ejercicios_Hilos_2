package Ej2;

import general.Utiles;

public class Ej2 {
    /**
     * 2.- Crear un programa que pida al usuario un número mayor de 10.
     * Lanzar dos hilos: el primero imprimirá por pantalla los números del 0 al número
     * introducido; El segundo imprimirá por pantalla los números del número introducido
     * al 0. Tiempo de retardo máximo 1 segundo.
     */
    public static void lanzarHilos2() {
        int numero;
        boolean salir = false;
        Ej2Hilo ej2Hilo;
        Ej2Hiloinv ej2Hiloinv;

        do {
            System.out.println("Intoduce un numero mayor qur 10");
            numero = Utiles.sc.nextInt();


            if (numero > 10) {
                salir = true;
            } else {
                System.out.println("el numero introducido es menor que 10");
            }

        } while (salir == false);
        ej2Hilo = new Ej2Hilo(1, numero);
        ej2Hiloinv = new Ej2Hiloinv(2,numero);
        ej2Hilo.start();
        ej2Hiloinv.start();
    }
}
