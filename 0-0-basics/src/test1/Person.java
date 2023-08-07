package test1;

import java.util.Objects;

public class Person {
    int ages, height;
    String name;

    public Person(int age, int height, String name) {
        ages = age;
        this.height = height;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return ages == person.ages && height == person.height && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ages, height, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "Age=" + ages +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }


}
