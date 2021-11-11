package Serialize1;

// Transient - если мы не хотим какое-то поле сериализовывать (записывать)
// serialVersionUID - поле, которое создается при использовании вами сериализации. см. настройки
// Inspections \ Java \ Serialization issues \ serializable class without 'serialVersionUID'
// в некоторых проетах требуется , чтобы такое поле у сериализуемого объекта было.

import java.io.*;


public class Serialize13 {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob");

        // try-с-ресурсами см. Deserialize13.java
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) {
            //FileOutputStream fos = new FileOutputStream("people.bin");
            //ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1);

            //oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
