public class Break_Continue {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            System.out.println(i);
            i++;
            if (i == 15) {
                break;
            }
        }
        System.out.println("Мы вышли из цикла");

        for (int j = 0; j <= 15; j++) {
            if (j%2 == 0) {
                continue;
            }
            System.out.println(j);
        }
        System.out.println("Мы вышли из цикла 2");
    }
}
