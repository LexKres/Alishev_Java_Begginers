package Polimorph;

public class UpDownCasting {
    Dog dog = new Dog();

    // "Upcasting" - "Восходящее преобразование".  Происходит неявно.
    Animal animal_dog = new Dog();

    // еще пример восходящего преобразования
    Animal animal_dog2 = dog;


    // "Downcasting" - "Низходящее преобразование".  Происходит явно.
    Dog dog2 = (Dog) animal_dog2;
    public void work_casting() {
        dog2.bark();
    }

    Animal animal = new Animal();
    Dog dog3 = (Dog) animal;  // эти преобразования не меняют объект, они меняют ссылку на объект
    public void work_casting2() {
        dog3.bark();  // при запуске компиляции Java скажет, что объект класса Animal не м/б преобразован в
                      // класс Dog, т.к. метода bark() изначально в классе Animal нет.
    }

}
