package NestedClasses;

/*
     Классы в Java можно создавать в файле вместе с основным классом,
     можно в отдельном файле в том же каталоге,
     можно внутри другого класса,
     можно внутри метода.

 */

public class Test {
    public static void main(String[] args) {
        Electrocar electrocar = new Electrocar(1);
        electrocar.start();

        // создание статического сложенного класса
        Electrocar.Battery battery = new Electrocar.Battery();

    }
}
