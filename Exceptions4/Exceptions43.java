package Exceptions4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exceptions43 {
    public static void main(String[] args) {

        // исключения наследуются друг от друга, попробуем обработать родительский класс для всех исключений
        try {
            run();
        } catch (Exception e) {
        }
        // писать обработку всех других исключений уже нет смысла, т.к. все исключения попадут в блок с
        // Exception
    }

    // можно выбрасывать несколько исключений
    public static void run() throws IOException, ParseException, IllegalArgumentException {

    }
}
