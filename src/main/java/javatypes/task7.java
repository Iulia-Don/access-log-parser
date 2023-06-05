package javatypes;

import java.util.Scanner;

public class task7
{
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int num = new Scanner(System.in).nextInt();
        System.out.println(isInRange(a,b,num));
    }
    public static boolean isInRange(int a, int b, int num){
        return(a<=num && num<=b) || (b<=num && num<=a);
    }


}
