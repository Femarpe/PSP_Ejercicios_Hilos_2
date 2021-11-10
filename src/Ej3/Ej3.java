package Ej3;



import java.io.*;

public class Ej3 {
    /**
     * 3.- Crear un programa con tres hilos que escriban en un mismo archivo
     * (Prueba.txt, habrá que crearlo si no existe). El primero de ellos escribirá
     * los números del 11 al 20; el segundo del 21 al 30; y el tercero del 1 al 10.
     */

    public static void lanzarHilos3() throws IOException {
        String nombreFichero = "./PruebaEj3.txt";

        BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero));
        BufferedReader br = new BufferedReader(new FileReader(nombreFichero));


        Ej3Hilo ej3Hilo1 = new Ej3Hilo(11, 20, bw, br);
        Ej3Hilo ej3Hilo2 = new Ej3Hilo(21, 30, bw, br);
        Ej3Hilo ej3Hilo3 = new Ej3Hilo(1, 10, bw, br);
        ej3Hilo1.start();
        ej3Hilo2.start();
        ej3Hilo3.start();

        new HcS3(bw,br).start();

    }
}
