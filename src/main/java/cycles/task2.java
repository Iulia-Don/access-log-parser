package cycles;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        System.out.println("Введите число:");
        int x = new Scanner(System.in).nextInt();
        System.out.println(reverseListNums(x));
    }
    public static String reverseListNums(int x){
        String res= "";
        for( int i=x; i>=0; i--){
            res= res+" "+i;
        }
        return res;
    }
}
