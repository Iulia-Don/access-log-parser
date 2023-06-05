package javatypes;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        System.out.println(isDivisor(a,b));

    }
    public static boolean isDivisor (int a, int b){
        return (a%b==0) || (b%a==0);
    }
}
