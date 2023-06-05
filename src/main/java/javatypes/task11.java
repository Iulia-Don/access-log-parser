package javatypes;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        int x = new Scanner(System.in).nextInt();
        System.out.println(abs(x));
    }
    public static int abs(int x){
        if (x>=0) return x;
            else {
                x=-x;
        }
    return x;
    }
}


//Необходимо реализовать метод таким образом, чтобы он возвращал модуль числа х
//(если он был положительным, то таким и остается, если он был отрицательным – то необходимо вернуть его без знака минус).
