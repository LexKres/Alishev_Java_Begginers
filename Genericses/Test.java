package Genericses;

// "Параметризация классов" или "Generic"-ки
// появились в Java v.5

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // как было до Generic-ов
        List animals = new ArrayList(); // ArrayList - динамический массив, т.е. может расширяться
                                     // List - интерфейс
        Animal ourAnimal = new Animal();

        animals.add("cat"); // добавляем элемент в массив
        animals.add("dog");
        animals.add("frog");
        animals.add(ourAnimal); // т.к. ArrayList содержит все элементы как ссылку на класс Object


        // ------------------------------------ до Java 5 ----------------------------------------
        // String animal = animals.get(1);
        // появится просьба делать cast в String, хотя мы вроде бы обавляли в массив строки
        // ArrayList хранит не какие-то конкретные объекты (String , Integer, и т.д., а храниит
        // объекты класса Object.
        String animal = (String) animals.get(1);  // так было до Java v.5  Т.е. это downcasting к классу String
                                                  // Java 5 выход сентябрь 2004
        System.out.println(animal);

        // String animal = (String) animals.get(3); // будет ошибка , т.к. ссылку на Animal нельзя перекастить на String

        // ------------------------------------  с Java 5 --(сентябрь 2004)---- generics -------
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat"); // добавляем элемент в массив
        animals2.add("dog");
        animals2.add("frog");
        // animals2.add(ourAnimal); // Это ошибка, т.к. можем класть туда только объекты класса String

        //Теперь не требуется использовать downcasting
        String animal2 = animals2.get(1);

        System.out.println(animal);

        // ------------------------------------  с Java 7 (июль 2011 ) ---------------------------
        // стало можно тип указать только слева
        List<String> animals3 =new ArrayList<>();






    }
}

