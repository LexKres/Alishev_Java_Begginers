package Enums;

public class EnumNow2 {
    public static void main(String[] args) {
        Animal2 animal2 = Animal2.CAT;
        System.out.println(animal2.getTranslation());
        System.out.println(animal2.toString());

        // возвращает название Enum в виде строки
        System.out.println(animal2.name());

        // статически метод у Enum   Возвращает объект по имени перечисления
        Animal2 frog = Animal2.valueOf("FROG");
        System.out.println(frog.name());

        // SH а можно вот так записать
        System.out.println(Animal2.valueOf("DOG").getTranslation());

        // получение индекса элемента перечисления
        System.out.println(frog.ordinal());
    }

}
