package Exceptions4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exceptions4 {
    public static void main(String[] args) {
        try {
            run();
        } catch (IOException e) {    // IllegalArgumentException наследуется от IOException
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    // можно выбрасывать несколько исключений
    public static void run() throws IOException, ParseException, IllegalArgumentException {

    }
}
