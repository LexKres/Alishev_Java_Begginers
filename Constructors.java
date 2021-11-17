public class Constructors {
    public static void main(String[] args) {
        Human h = new Human();
        Human human = new Human ("Степа");
        Human woman = new Human ("Роза", 20);

        Human.getAmount(); // к статическим методам обращаемся не создавая объект, а через имя класса
    }
}

class Human {
    private String name;
    private int age;
    private static int amount;
    private final String CONSTANT;  // final для создания константы, имя пишется заглавными по соглашению
                                 // либо инициализацию final-переменной можно сделать в конструкторе, если это
                                 // не сделано явно при описании переменной

    public static final String CONSTANT2 = "HUMANS"; //static final уже в констурторе нельзя инициализировать
                                               // т.к. static существует без создания объекта, а значит без
                                               // вызова конструтора

    public Human() {  //Конструткор по умолчанию. Конструктор ничего не возвращает
        this.CONSTANT = "";  //final-переменную дает инициализировать здесь, а в другом конструкторе уже нет.
                             // если она не static, то будет расход памяти, т.к. все равно у всех созданных
                             // объектов она будет иметь одно и то же значение
        amount++;
    }

    public Human(String name) {
        this();  // вызов другого конструтора должен быть первой строкой и используется для этого слово this
        this.name = name;
        age = 0;
        System.out.println("Привет из второго конструтора");
    }

    public Human(String name, int age) {
        this();
        this.name = name;
        this.age = age;
        System.out.println("Привет из третьего конструтора");
    }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    //статический метод может  работаь только со статическими переменными
    public static void getAmount() {
        System.out.println(amount);
    }
}