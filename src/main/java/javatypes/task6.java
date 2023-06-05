package javatypes;

import java.io.IOException;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) throws IOException {
        char x = (char)System.in.read();
        System.out.println(isUpperCase(x));
    }
    public static boolean isUpperCase(char x){
        return x>='A'&&x<='Z';
    }
}
