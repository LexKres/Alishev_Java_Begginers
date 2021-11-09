package Polimorph;

public class Test {
    public static void main (String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Dog dog = new Dog();
        dog.eat();

        Animal animal_dog = new Dog();
        animal_dog.eat();

        // Ограничение полиморфизма, это не сработает
        // animal_dog.bark();
        // Само собой это работает:
        dog.bark();

        // "Позднее связывание"
        // Не смотря на то, что Cat создан как Animal, метод eat() отрабатывает как метод класса Cat, а не Animal
        Animal animal_cat = new Cat();
        animal_cat.eat();

        Cat cat = new Cat();

        System.out.println("---------------------------");

        // чтобы тут вызывать метод , этот метод следует делать как static
        Demo_Poly(animal);
        Demo_Poly(dog);
        Demo_Poly(cat);
        Demo_Poly(animal_dog);
        Demo_Poly(animal_cat);


        // "Приведение типов"
        // по умолчанию числа с десятичной частью всегда double, поэтому чтобы не было ошибки
        // надо дописать букву f или F после числа при инициализации перменной float.
        float f = 123.4f;
        // также по умолчанию целое число имеет тип int, поэтому дописываем l (L)
        long l = 12324232322L;

        int a = 4;
        long g = a; //неявное приведение
        int x = (int)g; //явное приведение

        byte b = (byte)128; // byte это -128..127
        System.out.println(b); // выведет -128
        b = (byte)129; // выведет -127
        System.out.println(b); // выведет -127  SH: т.е. мы двигаемся по кругу. Клево! Можно в цикле зациклить.
        /*
           for (int i = 2000; i < 50000; i++) {
               b = byte(i);
               // значечние b будет бегать по кругу в 256 значений от -128 до 127
           }
         */

        // классы-обертки для обычных типов данных
        Integer x2 = new Integer(123);  // такая запись устарела с Java 9
        String str = x2.toString();
        Integer.parseInt("1234");  // Статический метод класса Integer преобразует строку в число

        // примитивные методы занимают меньше места в памяти и их инициализация чище.

        // "автоупаковка"
        Integer yi = 1;
        // "автораспаковка"
        int y = yi;


    }

    // Демонстрация полиморфизма, теперь уже при передаче параметра в метод
    public static void Demo_Poly (Animal animal) {
        System.out.print(" Работает метод Demo_Poly с параметром-полиморфом ");
        animal.eat();
        System.out.println();
    }


}
