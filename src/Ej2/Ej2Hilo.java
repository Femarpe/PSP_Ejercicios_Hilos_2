package Ej2;

import general.Utiles;

public class Ej2Hilo extends Thread {
    private int id;
    private int n;

    public Ej2Hilo(int id, int n) {
        this.id = id;
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 1; i <= n; i++) {
            System.out.println(id+"-"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
