package Ej1;

public class Ej1 {
    /**1.- Crear un programa que lance dos hilos. El primero de ellos imprimirá por
     * pantalla 10 veces la palabra “Hola” y el segundo 10 veces la palabra “Adiós”.
     * Incluir un tiempo de retardo aleatorio entre sentencias de hasta 3 segundos.*/
    public static void lanzarHilos1(){
        Ej1Hilo ej1Hilo1 = new Ej1Hilo("Hola",10);
        Ej1Hilo ej1Hilo2 = new Ej1Hilo("Adios",10);
        ej1Hilo1.start();
        ej1Hilo2.start();
    }
}
