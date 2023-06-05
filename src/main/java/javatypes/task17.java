package javatypes;

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        System.out.println("Введите число x:");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Введите число y:");
        int y = new Scanner(System.in).nextInt();

        System.out.println(sum2(x, y));
    }
    public static int sum2(int x, int y){
        int i = x+y;
        if (i>=10 && i<=19) return 20;
        else return i;

    }

}
