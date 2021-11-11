package Serialize1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

// прочитать из файла объекты в массив

public class Deserialize12 {
    public static void main(String[] args) {
        try {
            // чтение первого способа записи массива
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            // вначале считаем кол-во объектов
            int personCount = ois.readInt();
            Person[] people = new Person[personCount];

            for(int i = 0; i < personCount; i++) {
                people[i] = (Person) ois.readObject();
            }

            for (Person person: people) {
                System.out.println(person);
            }

            // или еще массив можно вывести вот так
            System.out.println(Arrays.toString(people));

            ois.close();

            // чтение второго способа записи массива
            fis = new FileInputStream("people2.bin");
            ois = new ObjectInputStream(fis);

            Person[] people2 = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(people2));

            ois.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
