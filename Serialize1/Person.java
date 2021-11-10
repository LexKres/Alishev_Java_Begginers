package Serialize1;

import java.io.Serializable;

// чтобы класс можно было записывать в файл необходимо разрешить Java-е его сериализовывать
// для этого следует имплементировать к классу интерфейс Serializable
// в этом интерфейсе никаких методов нет, поэтому мы не должны ничего реализовывать
// это просто как бы флаг для Java c нашим разрешением сериализовывать объект
public class Person implements Serializable {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) { this.id = id; }

    public void setName(String name) { this.name = name;}

    public String toString() {
        return id + " : " + name;
    }
}
