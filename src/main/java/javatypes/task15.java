package javatypes;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args){
        System.out.println("Введите число x:");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Введите число y:");
        int y = new Scanner(System.in).nextInt();
        System.out.println("Введите число z:");
        int z = new Scanner(System.in).nextInt();
        System.out.println(max3(x,y,z));
    }
    public static int max3(int x, int y, int z){
        int max =0;

        if (x > y){
            max = x;
        }else{
            max = y;
        }

        if (max < z){
            max = z;
        }
        return max;
    }
}



//Необходимо реализовать метод таким образом, чтобы он возвращал максимальное из трех полученных методом чисел.
// Подсказка: идеальное решение включает всего две инструкции if и не содержит вложенных if.