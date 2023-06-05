package javatypes;

import java.util.Scanner;

public class task18 {public static void main(String[] args) {
    System.out.println("Введите число x:");
    int x = new Scanner(System.in).nextInt();

    System.out.println(is35(x));
  }
    public static boolean is35(int x){
    if (x%3==0 && x%5==0) return false;
    if (x%3==0 || x%5==0) return true;

    return false;
    }
}
