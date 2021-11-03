// Публичный класс может быть только один
// Имя публичного класса должно совпадать с именем java-файла
public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Roman";
        person1.age = 50;

        Person person2 = new Person();
        person2.name = "Bob";
        person2.age = 20;

        System.out.println(person1.name + ", " + person1.age + " лет");
        System.out.println(person2.name + ", " + person2.age + " лет");

        person1.sayHello();
        person1.speak();
        person2.sayHello();
        person2.speak();

        System.out.println("Лет до пенсии " + person1.calculateYearsToRetirement());
        System.out.println("Лет до пенсии " + person2.calculateYearsToRetirement());

        person1.setNameAndAge("Roman Romanovich", 55);
        person1.speak();


        Man man = new Man();  //SH:  Это же вызов конструктора  new Man()

        man.setName("Sveta");
        man.setAge(15);
        System.out.println("Я - " + man.getName() + " и мне целых " + man.getAge());

    }
}

class Person {
    String name;
    int age;

    void speak() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет");
    }

    void sayHello() {
        System.out.println("Привет!");
    }

    int calculateYearsToRetirement () {
        int years = 65 - age;
        return years;
    //    System.out.println("Лет до пенсии: " + years);
    }

    void setNameAndAge(String username, int userage) {
        this.name = username;
        this.age  = userage;
    }

}

class Man {
    private String name;
    private int age;

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("введено пустое имя");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("возраст должен быть положительным");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

}

class Test2 {

}

