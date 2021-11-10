package Exceptions4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exceptions42 {
    public static void main(String[] args) {

        // в Java 7 появился multicatch как замена нескольким блокам catch
        try {
            run();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    // можно выбрасывать несколько исключений
    public static void run() throws IOException, ParseException, IllegalArgumentException {

    }
}
