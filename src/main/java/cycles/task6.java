package cycles;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args){
        System.out.println("Введите число:");
        int x = new Scanner(System.in).nextInt();
        System.out.println(equalNum(x));
    }
    public static boolean equalNum(int x){
        int i =0;
        boolean res= false;
        while(x>=1){
            i=x%10;
            x=x/10;
            if (i==(x%10)) res=true;
            if (res==false) break;
        }
        return res;
    }
}
