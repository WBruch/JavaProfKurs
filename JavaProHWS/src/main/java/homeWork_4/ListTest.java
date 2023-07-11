package homeWork_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// 1. Создать лист.
// В цикле наполнить лист 10 миллионами значений (от 1 до 10000000)
// Перебрать лист с помощью for-each, в теле цикла каждое значение листа записать в переменную temp.
// Сделать то же самое с помощью классического for.
// Сделать то же самое с помощью классического for, но сначала вынести размер листа в отдельную переменную, а потом эту переменную использовать внутри условия цикла.
// Сделать то же самое, что и в пункте 5, но перебрать лист с конца до начала.
//Сделать то же самое, но используя Iterator.
//Сделать то же самое, но используя ListIterator.
//Для всех случаев 3-8 замерить время, в течение которого отрабатывает цикл:
//Замеряете текущее время до цикла с помощью метода System.currentTimeMillis();
//Замеряете текущее время после цикла с помощью метода System.currentTimeMillis();
//Выводите разницу во времени после и до в консоль.
//Кроме затраченного времени выводить в консоль больше ничего не нужно, т.к. это существенно замедлит работу, смысл эксперимента будет потерян.
//Если отрабатывает очень быстро, и разница не особо понятна, попробовать на 100 миллионах значений.
public class ListTest {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100_000_000; i++) {
            list.add(i);
        }

        Long t1 = System.currentTimeMillis();
        int temp = 0;
        for(Integer current : list) {
           temp = current;
        }
        Long t2 = System.currentTimeMillis();
        System.out.println("for each loop time = " + (t2 - t1) + " milliseconds");


        long t3 = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            temp = list.get(i);
        }
        long t4 = System.currentTimeMillis();
        System.out.println("for loop time = " + (t4 - t3) + " milliseconds");


        long t5 = System.currentTimeMillis();
        int length = list.size();
        for (int i = 0; i < length; i++) {
            temp = list.get(i);
        }
        long t6 = System.currentTimeMillis();
        System.out.println("2nd for loop temp = " + (t6 - t5) + " milliseconds");


        long t7 = System.currentTimeMillis();
        for (int i = length; i > 0; i--) {
            temp = list.get(i - 1);
        }
        long t8 = System.currentTimeMillis();
        System.out.println("2nd reverse for loop temp = " + (t8 - t7) + " milliseconds");


        long t9 = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            temp = iterator.next();
        }
        long t10 = System.currentTimeMillis();
        System.out.println("Iterator temp = " + (t10 - t9) + " milliseconds");


        long t11 = System.currentTimeMillis();
        ListIterator<Integer> listIterator1 = list.listIterator();
        while (listIterator1.hasNext()){
            temp = listIterator1.next();
        }
        long t12 = System.currentTimeMillis();
        System.out.println("ListIterator temp = " + (t12 - t11) + " milliseconds");


    }
}
