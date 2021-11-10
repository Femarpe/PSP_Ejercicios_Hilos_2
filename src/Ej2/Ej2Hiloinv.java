package Ej2;

public class Ej2Hiloinv extends Thread {
    private int id;
    private int n;

    public Ej2Hiloinv(int id, int n) {
        this.id = id;
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = n; 0 <= i; i--) {
            System.out.println(id+"-"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
