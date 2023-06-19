package homeWork_1.task2;

public class Phone {

    long number;
    String model;
    int weight;

    public Phone(long number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }
    public long getNumber() {
        return number;
    }

}
