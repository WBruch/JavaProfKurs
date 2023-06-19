package homeWork_1.task2;

public class PhoneMain {
    public static void main(String[] args) {

        Phone motorola = new Phone(+4980004875631L, "Razer v3", 250);
        Phone sony = new Phone(+7224004879253L, "Xperia", 130);
        Phone xiaomi = new Phone(+3880004875346L, "Mi 12", 200);

        System.out.println("+" + motorola.number + ", " + motorola.model + ", " + motorola.weight);
        System.out.println("+" + sony.number + ", " + sony.model + ", " + sony.weight);
        System.out.println("+" + xiaomi.number + ", " + xiaomi.model + ", " + xiaomi.weight);
        System.out.println("===================================");

        motorola.receiveCall("Mike");
        System.out.println(motorola.getNumber());
        System.out.println("===================================");

        sony.receiveCall("John");
        System.out.println(sony.getNumber());
        System.out.println("===================================");

        xiaomi.receiveCall("Anne");
        System.out.println(xiaomi.getNumber());
        System.out.println("===================================");
    }

}
