package Interfaces;

// класс может реализовывать любое кол-во интрефейсов, но наследовать может только один класс
public class Person implements Info{
    public String name;

    // Alt-Insert  для вызова меню Generate
    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public void showInfo() {
        System.out.println("Name is " + this.name);
    }
}

