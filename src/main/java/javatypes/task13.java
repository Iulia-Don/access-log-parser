package javatypes;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args){
        System.out.println("Введите число x:");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Введите число y:");
        int y = new Scanner(System.in).nextInt();
        System.out.println(max(x,y));
    }
    public static int max(int x, int y){
        if (x<y) return y;
        else return x;
    }
}
