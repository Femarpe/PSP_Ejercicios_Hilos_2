package Ej3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class HcS3 extends Thread {
    private BufferedWriter bw;
    private BufferedReader br;

    public HcS3(BufferedWriter bw, BufferedReader br) {
        this.bw = bw;
        this.br = br;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            bw.close();
            br.close();
        } catch (InterruptedException | IOException e) {
            return;
        }
    }
}
