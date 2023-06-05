package javatypes;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args){
        int x = new Scanner(System.in).nextInt();
        System.out.println(is2Digits(x));



    }
    public static boolean is2Digits(int x){
        boolean res = (10 <= x)&&(x <= 99);
        return res;

    }
}

//x (10 <= x <= 99)