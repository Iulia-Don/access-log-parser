package javatypes;

import java.util.Scanner;

public class task19 {

        public static void main(String[] args){
            System.out.println("Введите число x:");
            int x = new Scanner(System.in).nextInt();
            System.out.println("Введите число y:");
            int y = new Scanner(System.in).nextInt();
            System.out.println(magic6(x,y));

        }
        public static boolean magic6(int x, int y){
        if (x==6 || y==6) return true;
        if (x+y==6) return true;
        if (x-y==6 || y-x==6) return true;
        else return false;
        }

    }
