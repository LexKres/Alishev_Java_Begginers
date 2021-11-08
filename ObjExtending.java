public class ObjExtending {
    public static void main (String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        Dog dog = new Dog();
        dog.sleep();
        dog.eat();
        dog.bark();
        dog.showName();
    }
}
