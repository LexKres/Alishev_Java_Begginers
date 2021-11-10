package EqualsStringPool;

public class EqualsStringPoolDemo {
    public static void main(String[] args) {

        System.out.println("сравнение заданных через new");
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);

        System.out.println("сравнение заданных через =");
        String str3 = "Hello";
        String str4 = "Hello";
        System.out.println(str3.equals(str4));
        System.out.println(str3 == str4);
    }
}

/* Разница получается, потому что при создании str4 она указывает на уже имеющуюся область памяти,
   которая содержит уже такую же строку "hello".
   А в случае с new компилятору уже не отбрыкнуться. Хочу два объекта - получаю два объекта.

   Т.е. сравнение == у заданных через = включает механизм string pool в Java.  А в случае с new этот
   механизм не включается.
 */