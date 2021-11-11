package Serialize1;

// Запись массива объектов в файл

import java.io.*;


public class Serialize12 {
    public static void main(String[] args) {
        Person[] people = {new Person(1,"Bob"), new Person(2, "Mike"), new Person(3, "Tom")};

        try {
            // 1й способ
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // вначале записываем целове число и это длина массива
            oos.writeInt(people.length);
            // дальше один за другим можем записывать объекты
            for(Person person: people) {
                oos.writeObject(person);
            }

            oos.close();

            // 2й способ
            fos = new FileOutputStream("people2.bin");
            oos = new ObjectOutputStream(fos);

            // запишем наш массив целиком сразу
            oos.writeObject(people);

            oos.close();
            fos.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
