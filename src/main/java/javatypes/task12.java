package javatypes;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args){
        System.out.println("Введите число x:");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Введите число y:");
        int y = new Scanner(System.in).nextInt();
        System.out.println(safeDiv(x,y));

    }
    public static int safeDiv(int x, int y){

        if (y==0)  return 0;
        else return x/y;
    }
}
//y!=0