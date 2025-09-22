package main.java.com.mkdevs.dyma;

import main.java.com.mkdevs.dyma.Model;

@Model(
    value = "Object representation of a person.",
    author = "mkdevs",
    date = "2024-06-10",
    version = "1.0"
)
public class Person {
    
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
