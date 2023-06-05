package cycles;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        System.out.println("Введите число:");
        int x = new Scanner(System.in).nextInt();
        System.out.println(chet(x));
    }
    public static String chet(int x){
        String res= "0";
        for(int i=2; i<=x; i+=2){
            res= res+" "+i;
        }
        return res;
    }
}
