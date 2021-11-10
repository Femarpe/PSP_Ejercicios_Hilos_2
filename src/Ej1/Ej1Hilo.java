package Ej1;
import general.Utiles;
public class Ej1Hilo extends Thread{
    private String id;
    private int n;

    public Ej1Hilo(String id, int n) {
        this.id = id;
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 1; i <= n; i++) {
            System.out.println(id);
            try {
                Thread.sleep(Utiles.aleatorio(3000));
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
