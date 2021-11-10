package Ej4;



import java.io.*;

public class Ej4 {
    /**4.- Asignar prioridades a los hilos del ejercicio anterior para que escriban
     * la secuencia numérica de forma ascendente (de menor a mayor).*/

    public static void lanzarHilos4() throws IOException {
        String nombreFichero = "./PruebaEj4.txt";

        BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero));
        BufferedReader br = new BufferedReader(new FileReader(nombreFichero));


        Ej4Hilo ej4Hilo1 = new Ej4Hilo(11, 20, bw, br);
        Ej4Hilo ej4Hilo2 = new Ej4Hilo(21, 30, bw, br);
        Ej4Hilo ej4Hilo3 = new Ej4Hilo(1, 10, bw, br);
        ej4Hilo1.setPriority(Thread.NORM_PRIORITY);
        ej4Hilo2.setPriority(Thread.MIN_PRIORITY);
        ej4Hilo3.setPriority(Thread.MAX_PRIORITY);
        ej4Hilo1.start();
        ej4Hilo2.start();
        ej4Hilo3.start();

        new HcS4(bw,br).start();

    }
}
