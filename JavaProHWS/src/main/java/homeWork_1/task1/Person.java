package homeWork_1.task1;

public class Person {

    String fullName;
    int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void move() {
        System.out.println(getFullName() + " идёт");
    }

    public void talk() {
        System.out.println(getFullName() + " говорит");
    }
}
