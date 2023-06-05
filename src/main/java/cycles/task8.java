package cycles;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        int x = new Scanner(System.in).nextInt();
        leftTriangle(x);
    }

    public static void leftTriangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j=0; j<i; j++)  {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
