package Exceptions2;
// создадим свой класс для обработки исключений

public class ScannerException extends Exception {
    public ScannerException(String description) {
        super(description);

    }

}
