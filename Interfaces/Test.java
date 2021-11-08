package Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Alexander");

        System.out.println(" Вызов методов как animal1.sleep()  person1.sayHello() ");
        animal1.sleep();
        person1.sayHello();

        System.out.println("\n Вызов методов как animal1.showInfo()  person1.showInfo() ");
        animal1.showInfo();
        person1.showInfo();

        Info info1 = new Animal(2);
        Info info2 = new Person("Alex");

        System.out.println("\n Вызов методов как info1.showInfo()  info2.showInfo() ");
        info1.showInfo();
        info2.showInfo();
        // но поулчить доступ к методу из класса, например так нельзя сделать
        // info1.sleep(), как бы рассчитывая получить доступ к методу sleep() класса Animal, который
        // реализует интерфейс Info

        System.out.println("\n Выводим через метод outputInfo(info1), outputInfo(info2),когда Info info1, Info info2");
        outputInfo(info1);
        outputInfo(info2);

        System.out.println("\n Выводим через метод outputInfo(animal1), outputInfo(person1), когда Animal animal, Person person");
        outputInfo(animal1);
        outputInfo(person1);


    }

    // SH: короче, интерфейсы - это вроде как типизация для классов
    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
