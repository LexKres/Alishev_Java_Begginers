package Genericses;

import java.util.ArrayList;
import java.util.List;

public class Test2_Wildcards {
    public static void main (String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();

        // добавляем два животных
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();

        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimal);
        // test(listOfDogs);  ошибка.  Хотя если бы параметр был одиночным элементом класса Animal, то
        //                    можно было бы передать в него потомок этого класса, т.е. объект класса Dog
        // Чтобы это заработало, следует использовать такую весчь как
        // "Wildcard"  <? extends>
        test2(listOfDogs);


    }

    // чтобы тестировать сделаем приватный статичный метод
    private static void test(List<Animal> list) {
        for (Animal animal: list) {
            System.out.println(animal);    // таким образом будет вызываться метод toString(), который есть как
                                           // унаследованный метод от класса Object
        }
    }

    // теперь можем передавать список объектов класса Animal или его наследников
    private static void test2(List<? extends Animal> list) {
        for (Animal animal: list) {
            animal.eat();    // таким образом будет вызываться метод toString(), который есть как
            // унаследованный метод от класса Object
        }
    }

    // а в этом случае можем передавать список объектов класса Animal или его предков
    private static void test3(List<? super Animal> list) {
    /*  Но тогда возникает ошибка, т.к. мы не можем использовать методы класса Animal, т.к. их
        может не быть у вышестоящих классов
        for (Animal animal: list) {
            animal.eat();    // таким образом будет вызываться метод toString(), который есть как
            // унаследованный метод от класса Object
        }

     */
    }

}
