package Enums;

// Как делают с появлением Enum  (появились в Java 1.5  выпущена в 2004 г.  или же она также называется Java 5)

public class EnumNow {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;

        switch(animal) {
            case DOG:
                System.out.println("It's a dog");
                break;
            case CAT:
                System.out.println("It's a cat");
                break;
            case FROG:
                System.out.println("It's a frog");
                break;
            default:
                System.out.println("It's not an animal");
        }

        // ключевое слово instanceof проверяет является ли объект объектом этого класса
        System.out.println(animal instanceof Animal);
        System.out.println(animal instanceof Enum);

    }
}
