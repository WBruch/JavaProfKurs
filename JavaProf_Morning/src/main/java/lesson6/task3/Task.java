package lesson6.task3;

import java.util.ArrayList;
import java.util.List;

public class Task {
    public static void main(String[] args) {

        List<String> first = new ArrayList<>();
        List<String> second = new ArrayList<>();

        first.add("A");
        first.add("B");
        first.add("C");
        first.add("D");
        first.add("E");

        second.add("D");
        second.add("E");
        second.add("F");
        second.add("G");

        System.out.println(first);
        System.out.println(second + "\n");


        // 1. Объединение - A B C D E D E F G

        List<String> task1 = new ArrayList<>();
        task1.addAll(first);
        task1.addAll(second);
        System.out.println("1) " + task1);


        // 2. Объединение без дубликатов - A B C D E F G

        List<String> merged2 = new ArrayList<>();
        merged2.addAll(first);
        for (int i = 0; i < second.size(); i++) {
            if (!merged2.contains(second.get(i))) merged2.add(second.get(i));
        }
        System.out.println("2) " + merged2);


        // 3. Пересечение - D E D E

        List<String> task3 = new ArrayList<>();
        for (String current1 : first){
            for(String current2 : second){
                if (current1.equals(current2))
                    task3.add(current1);
            }
        }
        for (String current1 : second){
            for(String current2 : first){
                if (current1.equals(current2))
                    task3.add(current1);
            }
        }
        System.out.println("3) " + task3);

        // 4. Пересечение без дубликатов - D E

        List<String> task4 = new ArrayList<>();
        for(String current : first){
            if (second.contains(current))
                task4.add(current);
        }
        System.out.println("4) " + task4);


        // 5. Разность - A B C F G

        List<String> task5 = new ArrayList<>(task1);
        task5.removeAll(task3);
        System.out.println("5) " + task5);
    }
}
