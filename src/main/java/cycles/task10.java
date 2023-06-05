package cycles;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        guessGame();
    }

    public static void guessGame() {
        int randomNum = 3;
        int mis = 0;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while (true){
            System.out.println("What number am I thinking (0 to 9)? :");
            int x = sc.nextInt();
            if (x != randomNum) {
                System.out.println("No, try again");
                mis++;
            } else {
                System.out.println("Yes, it`s " + randomNum);
                System.out.println("Mistakes: "+mis);
                break;
            }
        }
    }
}
