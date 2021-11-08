public class AboutClassObject {
    public static void main(String[] args) {
        HumanObj ho = new HumanObj("Alexander", 34);
        System.out.println(ho);  // возвращает хэш-код объекта   скрытой вызов как System.out.println(ho.toString())
        ho.toString(); // возвращает хэш-код объекта  (до того как этот метод был переопределен)
    }
}

/*
   В одной папке не может быть два класса с одинаковым названием, поэтому HumanObj, т.к.
   Human уже есть в Constructors.java
   Для разделения классов и предупреждения конфликта имен исрользуются разные папки, т.е.
   пакеты (packeges)
 */
class HumanObj {
    private String name;
    private int age;

    public HumanObj(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // можем переопределить метод класса Object
    public String toString() {
        return name + ", " + age + "  хэш-код объекта: " + super.toString();   // super можно использовать, только чтобы обратиться к своему классу-родителю
    }
}

