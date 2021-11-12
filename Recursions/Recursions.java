package Recursions;

// Рекурсия - это вызов метода в теле этого же метода

public class Recursions {
    public static void main(String[] args) {
        counter(3);
    }

    private static void counter(int n) {
        System.out.println(n);

        if ( n == 0 )  return;
        else counter(n-1);
    }
}

