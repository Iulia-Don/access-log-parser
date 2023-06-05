package javatypes;

import java.util.Scanner;

public class task21 {
    public static void main(String[] args) {
        System.out.println("Введите число x:");
        int x = new Scanner(System.in).nextInt();
        System.out.println(day(x));
}
    public static String day(int x){
    switch (x){
        case 1: return "Понедельник";
        case 2: return "Вторник";
        case 3: return "Среда";
        case 4: return "Четверг";
        case 5: return "Пятница";
        case 6: return "Суббота";
        case 7: return "Воскресенье";
        default: return "это не день недели";
    }

    }
}
