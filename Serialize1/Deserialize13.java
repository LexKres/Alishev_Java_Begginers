package Serialize1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize13 {
    public static void main(String[] args) {
        // если класс (ObjectInputStream) реализут интерфейс Closable, то значит мы можем исользовать его в
        // try-с-ресурсами
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream( "people.bin"))) {
            // обе эти строки перешли в try-с-ресурсами
            // FileInputStream fis = new FileInputStream( "people.bin");
            // ObjectInputStream ois = new ObjectInputStream(fis);

            Person person1 = (Person) ois.readObject();
            System.out.println(person1);

            // это тоже теперь можем убрать, т.к. при использовании ObjectInputStream в try () -с-ресурсами
            // объект закрывается сам.
            // ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
