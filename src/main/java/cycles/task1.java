package cycles;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        System.out.println("Введите число:");
        int x = new Scanner(System.in).nextInt();
        System.out.println(listNums(x));
 }
    public static String listNums(int x){
        String res= "";
        for( int i=0; i<=x; i++){
           res= res+" "+i;
        }
        return res;
    }
}
