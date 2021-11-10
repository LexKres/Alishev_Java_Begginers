package AbstractClasses;

// разберем абстракные классы и их отличие от интерфейсов

public class AbstractClasses {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        // Animal - это концепция в отличие от конкретных Cat и Dog
        // Чтобы запретить создание объектов класса Animal, мф мжем пометить его словом abstract
        // Animal animal = new Animal();

        cat.makeSound();
        cat.eat();
        dog.makeSound();
        dog.eat();
    }
}
