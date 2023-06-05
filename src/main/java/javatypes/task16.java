package javatypes;

import java.util.Scanner;

public class task16 {
    public static void main(String[] args){
        System.out.println("Введите число x:");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Введите число y:");
        int y = new Scanner(System.in).nextInt();
        System.out.println("Введите число z:");
        int z = new Scanner(System.in).nextInt();
        System.out.println(sum3(x,y,z));
    }
    public static boolean sum3(int x, int y, int z){
        if(x+y==z) return true;
        if(x+z==y) return true;
        if(z+y==x) return true;
        else return false;
    }

}
