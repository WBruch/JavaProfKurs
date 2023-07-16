package lesson8.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        System.out.println(list);

        list.addLast("Pear");

        list.addFirst("Apple");
        list.addFirst("Peach");
        list.addFirst("Orange");

        System.out.println(list);

        list.addLast("Pineapple");

        System.out.println(list);

        List<String> strings = new ArrayList<>();
        ListIterator<String> iter = strings.listIterator();

        System.out.println("Цикл for-each");
        for (String current : list) {
            System.out.println(current);
        }





    }
}
