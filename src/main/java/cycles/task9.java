package cycles;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        int x = new Scanner(System.in).nextInt();
        rightTriangle(x);
    }

    public static void rightTriangle(int x) {
        for (int i = 0; i <= x; i++) {
            for (int j=x-i; j>0; j--)  {
                System.out.print(" ");
            }
            for (int k=0; k<i; k++)  {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

