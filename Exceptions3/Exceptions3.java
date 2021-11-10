package Exception3;


//   Checked (compile time exception) (проверенные исключения) = исключительные случаи в работе программы
//   (см. Exceptions1 и Exceptions2)
// и Unchecked (runtime exception) (непроверенные исключения) = ошибка в работе программы, их не обрабатывают
//   их исправляют или исключают
//   (данный примеры)
public class Exceptions3 {
    public static void main(String[] args) {
        // 1
        int a = 1 / 0;

        // 2
        String name = null;
        name.length();

        //3
        int[] arr = new int[2];
        System.out.println(arr[2]);  // место в памяти выделено под 2 ячейки массива (0 и 1), а
                                     // мы пытаемся адресовать место в памяти для несуществующей 3-ей ячейки (2)



    }
}
