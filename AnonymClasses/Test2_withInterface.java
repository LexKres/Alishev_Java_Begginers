package AnonymClasses;

interface AbleToEat {
    public void eat();
}

public class Test2_withInterface {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating...");
            }
        };

        ableToEat.eat();
    }
}
