package general;

import java.util.Random;
import java.util.Scanner;

public class Utiles {
    public static Scanner sc = new Scanner(System.in);

    public static int aleatorio(int dC) {
        Random rd = new Random();
        int choose = rd.nextInt(dC);
        if (choose < 0) {
            choose = choose * -1;
        }
        return choose;

    }
}