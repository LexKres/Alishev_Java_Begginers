package Polimorph;

public class Cat extends Animal{
    public Cat() {
        name = "Cat";
    }

    // переопределение родительского метода
    public void eat() {
        super.eat();
        System.out.println("Метод eat() переопределен! Лапой по мордАм-то как щас дам!");
    }
}
