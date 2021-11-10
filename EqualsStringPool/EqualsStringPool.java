package EqualsStringPool;

// Как сравнивать объекты между собой?

public class EqualsStringPool {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        System.out.println(animal1 == animal2);   // false т.к. сравнение == сравнивает ссылки на объекты, а не сами объекты
                                                // сравнение == работает для примитивных типов данных как int, char

        // для сравнения классов  в классе Object определен метод equals()
        System.out.println(animal1.equals(animal2));

        // но чтобы сравнивать классы структурно, нам требуется переопределить метод equals()

        EqAnimal eqAnimal1 = new EqAnimal(1);
        EqAnimal eqAnimal2 = new EqAnimal(1);

        System.out.println(eqAnimal1.equals(eqAnimal2));


        // тем не менее для строк сравнение == работает корректно
        System.out.println("сравнение заданных через new");
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);
        // Ха-ха-ха!  учебное видео от 08-09-2017 и там это true
        // а у меня на 10-11-2021 это уже false

        System.out.println("сравнение заданных через =");
        String str3 = "Hello";
        String str4 = "Hello";
        System.out.println(str3.equals(str4));
        System.out.println(str3 == str4);
        // хотя вот здесь это true !!!!  Потому что строки я создал
        // как и в уроке - через String str = "Hello", а не через new

        // а вот так уже равно false, т.к. str5 указвает на другой объект
        String str5 = "Hello123".substring(0, 5);
        System.out.println(str3 == str5);
    }
}

/* Разница получается, потому что при создании str4 она указывает на уже имеющуюся область памяти,
   которая содержит уже такую же строку "hello".
   А в случае с new компилятору уже не отбрыкнуться. Хочу два объекта - получаю два объекта.

   Т.е. сравнение == у заданных через = включает механизм string pool в Java.  А в случае с new этот
   механизм не включается.
 */

class Animal {
    protected int id;

    public Animal() {
        this.id = -1;
    }

    public Animal(int id) {
        this.id = id;
    }
}

// чтобы показать различие я (SH) пример изменений описал как класс-наследник от Animal вместо перетирания кода
// класса Animal, как это происходит в видео-уроке.
class EqAnimal extends Animal {

    public EqAnimal() {
        this.id = -1;
    }

    public EqAnimal(int id) {
        super(id);
    }

    public boolean equals(Object obj) {    // для переопределения метода мы должны полностью повторить его сигатуру
        EqAnimal otherEqAnimal = (EqAnimal) obj; // поэтому прихожится писать параметр как Object obj, а потом делать downcasting
        return this.id == otherEqAnimal.id;
    }
}