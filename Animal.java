// Для демонстрации наследования в ObjExtending.java
public class Animal {
    String name = "Some animal";
    // private String name = "Some animal"; // В этом случае в классе-наследнике получить доступ к полю недьзя

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }

}
