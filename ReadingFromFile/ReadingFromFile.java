package ReadingFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        // самый прстой способ читать файл - с использованием Scanner
        String separator = File.separator;
        String path = separator + "home" +
                      separator + "user" +
                      separator + "IdeaProjects" +
                      separator + "Alishev_Java_Begginers" +
                      separator + "src" +
                      separator + "ReadingFromFile" +
                      separator;
        String fName1 = path + "FileForReading.txt";
        String fName2 = path + "FileForReading2.txt";

        File file = new File(fName1);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();

        File file2 = new File(fName2);
        Scanner scanner2 = new Scanner(file2);
        String line = scanner2.nextLine();
        String[] words = line.split(" ");
        System.out.println(Arrays.toString(words));

        int[] numbers = new int[3];
        int counter = 0;
        for(String number: words) {
            numbers[counter++] = Integer.parseInt(number);
        }
        System.out.println(numbers);  // у массива не определен метод toString() поэтому получим [@119d7047
        System.out.println(Arrays.toString(numbers));  // а вот так получится
        scanner2.close();
    }
}
