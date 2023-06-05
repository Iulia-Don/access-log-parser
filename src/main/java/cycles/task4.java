package cycles;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        System.out.println("Введите число:");
        int x = new Scanner(System.in).nextInt();
        int y = new Scanner(System.in).nextInt();
        System.out.println(pow(x,y));
    }
    public static int pow(int x, int y){
        int res =1;
        for(int i=1; i<=y; i++){
            res= res*x;
        }
        return res;
    }
}
