package javatypes;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args){

        int x = new Scanner(System.in).nextInt();
        System.out.println(isPositive(x));

    }
    public static boolean isPositive(int x){
        boolean res = x>0;
        return res;

 }
}








//  Необходимо реализовать метод таким образом, чтобы он принимал число x и возвращал true если оно положительное.