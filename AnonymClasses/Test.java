package AnonymClasses;

class Animal {
    public void eat() {
        System.out.println("Animal is eating...");
    }
}

class OtherAnimal extends Animal {
    public void eat() {
        System.out.println("Other animal is eating...");
    }
}

public class Test {
    public static void main (String[] args) {
        Animal animal = new Animal();
        animal.eat();

        OtherAnimal otherAnimal = new OtherAnimal();
        otherAnimal.eat();

        // чтобы не создавать новый класс только лишь для того, чтобы один раз воспользоваться
        // переопределенным методом, можно использовать анонимный класс, переписав метод при объявлении
        // создания объекта класса
        Animal anAnimal = new Animal() {
            @Override
            public void eat() {
                System.out.println("an Animal is eating...");
            }
        };

        // теперь можно вызвать переопределенный метод
        anAnimal.eat();
    }
}
