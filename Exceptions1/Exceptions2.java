package Exceptions1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions2 {
    // Из нашего метода readFile() бросаем исключение.
    // Его можно брсать и дальше уже в из метода main, но можно и обработать вызов readFile()
    // блоком try/catch

    public static void main(String [] args) {

        try {
            readFile();
        } catch (FileNotFoundException e) {
            // e.printStackTrace();
            System.out.println("файл не найден");
        }

        System.out.println("После блока  try-catch");
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("./Exception1/test.txt");
        Scanner scanner = new Scanner(file);
    }

}
