public class Arrays {
    public static void main(String[] args) {
        int number = 10;
        char character = 'n';
        String s = new String("Hello");  //ссылка на "массив" символов

        int[] numbers = new int[5]; //переменная numbers ссылается на массив int-значений

        // значения 0 - по умолчанию
        for (int j=0; j<numbers.length; j++) {
             System.out.println(numbers[j]);
        }

        System.out.println("инициализация элементов массива");
        for (int j=0; j<numbers.length; j++) {
            numbers[j] = (j+1) * 2;
            System.out.println(numbers[j]);
        }

        System.out.println("создание массива с инициалиацией");
        int[] num_init = {1, 2, 3};
        for (int j=0; j<num_init.length; j++) {
            System.out.println(num_init[j]);
        }
    }
}
