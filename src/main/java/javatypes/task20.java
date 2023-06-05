package javatypes;

import java.util.Scanner;

public class task20 {
    public static void main(String[] args) {
        System.out.println("Введите число x:");
        int x = new Scanner(System.in).nextInt();
        System.out.println(age(x));
    }
    public static String age(int x){
        if (x%100==11 ||x%100==12 || x%100==13|| x%100==14) return x+" лет";
        if (x%10==1) return x+" год";
        if (x%10==2 ||x%10==3|| x%10==4) return x+" года";

        return x+ " лет";
    }
}
