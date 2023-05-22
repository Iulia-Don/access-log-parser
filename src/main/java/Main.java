import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        System.out.println("Введите первое число:");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int number2 = new Scanner(System.in).nextInt();

        System.out.println( "сложение: "+ addition(number1, number2));
        System.out.println( "вычитание: "+ subtraction(number1, number2));
        System.out.println( "умножение: "+ multiplication(number1, number2));
        System.out.println( "деление: "+ division(number1, number2));
    }
    public static int addition(int x, int y){
        return x+y;
    }
    public static int subtraction(int x, int y){
        return x-y;
    }
    public static int  multiplication(int x, int y){
        return x*y;
    }
    public static double division(int x, int y){
        return (double)  x/y;
    }
}
