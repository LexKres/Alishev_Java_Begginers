public class Arrays_of_Strings {
    public static void main(String[] args) {
        int[] numbers =new int[5];
        numbers[0] = 10;

        String[] strings = new String[3];
        strings[0] = "Привет ";
        strings[1] = "Пока ";
        strings[2] = "Джава ";

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        //цикл for-each
        for (String string: strings) {
            System.out.println(string);
        }

        int[] numbers1 = {1, 2, 3};
        int sum = 0;
        for(int x: numbers1) {
            sum += x;
        }
        System.out.println("Сумма =" + sum);

        int value = 0; // здесь выделилось 32 бита
        String s; // здесь выделяется только память под ссылку, но не выделяется памяти под значение строки, по умолчанию = null
        s = "Строка";
        System.out.println(s);
    }
}
