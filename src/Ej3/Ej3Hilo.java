package Ej3;

import java.io.*;

public class Ej3Hilo extends Thread {

    private int n1;
    private int n2;
    private BufferedWriter bw;
    private BufferedReader br;

    public Ej3Hilo(int n1, int n, BufferedWriter bw, BufferedReader br) {
        this.n1 = n1;
        this.n2 = n;
        this.bw = bw;
        this.br = br;
    }


    @Override
    public void run() {
        try {

            String linea;
            String ficheroModificado = "";
            while ((linea = br.readLine()) != null) {
                ficheroModificado += linea + "\n";
            }


            for (int i = n1; i <= n2; i++) {
                ficheroModificado += (String.valueOf(i) + " ");

                System.out.println(i);

            }
            bw.write(ficheroModificado);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
