package WriteToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main (String[] args) throws FileNotFoundException {
        File file = new File("testfile");
        PrintWriter pw = new PrintWriter(file);  //класс для записи только текстовых сообщений

        pw.println("Test row 1");
        pw.println("Test row 2");

        pw.close();
    }
}
