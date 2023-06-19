package homeWork_1.task1;

public class PersonMain {
    public static void main(String[] args) {

        Person mike = new Person();
        Person johnny = new Person("Jonathan",35);

        johnny.move(johnny.fullName);
        johnny.talk(johnny.fullName);
    }
}
