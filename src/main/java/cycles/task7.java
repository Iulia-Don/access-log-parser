package cycles;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args){
        System.out.println("Введите число:");
        int x = new Scanner(System.in).nextInt();
        square(x);
    }
    public static void square(int x){
        for (int i=0; i<x; i++){
            for (int j=0; j<x; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
