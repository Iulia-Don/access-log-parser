package cycles;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args){
        System.out.println("Введите число:");
        long x = new Scanner(System.in).nextLong();
        System.out.println(numLen(x));
    }
    public static int numLen(long x){
        int res= 1;
        while (x>=1){
            if (x/10>1) res++;
            x/=10;
        }
        return res;
    }
}
