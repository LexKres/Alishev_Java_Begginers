package Polimorph;

public class Dog extends Animal{
    public Dog() {
        name = "Dog";
    }

    // метод для демонстрации ограничений в полиморфизме - обратиться к нему
    // из animal_dog нельзя, а из dog можно.
    public void bark() {
        System.out.println(name + " is barking.");
    }
}
