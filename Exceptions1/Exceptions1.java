package Exceptions1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    // 1й метод: написать throws (выбрасывает) исключение (FileNotFoundException)
    // public static void main(String [] args) throws FileNotFoundException {

    // 2й метод: использовать try/catch
    public static void main(String [] args) {
        File file = new File("./Exception1/test.txt");

        try {
            Scanner scanner = new Scanner(file);
            System.out.println("При ошибке в предыдущей строке это не выполнится");

        } catch (FileNotFoundException e) {
            // e.printStackTrace();
            System.out.println("файл не найден");
        }

        System.out.println("После блока  try-catch");


    }
}
