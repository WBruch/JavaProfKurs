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

    public void move(String fullName) {
        System.out.println(fullName + " идёт");
    }

    public void talk(String fullName) {
        System.out.println(fullName + " говорит");
    }
}
