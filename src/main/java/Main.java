import java.io.File;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count =1;
        while(true) {
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
             if (fileExists==false || isDirectory){
            System.out.println("файл не существует или указанный путь является путём к папке");
            continue;
            }
            else if(fileExists && isDirectory==false) {
                System.out.println("Путь указан верно");
                System.out.println("Это файл номер "+count);
            }
      }
    }
}
