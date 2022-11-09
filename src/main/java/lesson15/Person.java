package lesson15;

public class Person {
    private String name;
    private int age;

    public Person(int age) {
        this.age = age;
        this.name = "person" + age;
    }

    public static boolean filterOld(Person person) {
        return person.age > 20;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public boolean comparePerson(Person person) {
        return person.age < this.age;
    }
}
