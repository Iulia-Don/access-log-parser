package javatypes;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args){
        System.out.println("Введите число x:");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Введите число y:");
        int y = new Scanner(System.in).nextInt();
        System.out.println(makeDecision(x,y));
    }
    public static String makeDecision(int x, int y){
    String res = "";
        if( x>y) res = x+ ">"+ y;
        else if (x<y) res= x+ "<"+y;
        else if (x==y) res= x+"=="+y;
         return res;
        }
    }
