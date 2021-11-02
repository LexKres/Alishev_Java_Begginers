import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        String title = new String("Scanner for input data");
        System.out.println(title);
        Scanner s = new Scanner(System.in);
        System.out.println("Введите что-нибудь:");
        String string = s.nextLine();
        System.out.println("Вы ввели " + string);
    }
}
