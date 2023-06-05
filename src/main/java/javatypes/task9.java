package javatypes;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();
        System.out.println(isEqual(a,b,c));
    }
    public static boolean isEqual (int a, int b, int c){
        return (a==b)&&(a==c);
    }
}
