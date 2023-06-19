package lesson_1.task_1;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.age = 7;
        dog.color = "black";

        System.out.println("Age is " + dog.age);
        System.out.println("Color is " + dog.color);

        dog.bark();
        dog.sleep();
    }
}
