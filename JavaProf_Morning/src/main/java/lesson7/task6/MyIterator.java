package lesson7.task6;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Итератор, который возвращает чётные числа из переданной коллекции
 */
public class MyIterator implements Iterator<Integer> {

    private Iterator<Integer> iterator;
    private Integer next;

    public MyIterator(List<Integer> list) {
        iterator = list.iterator();
        moveToNext();
    }

    /**
     * Метод должен вернуть true, если в переданой коллекции ксть ещё чётные чисда
     */
    @Override
    public boolean hasNext() {
        return next != null;
    }

    /**
     * Вернёт следующее чётное число
     */
    @Override
    public Integer next() {
        Integer current = next;

        while (hasNext()) {

            moveToNext();
            break;
        }
        return current;
    }

    private void moveToNext() {

        while (iterator.hasNext()) {

            Integer current = iterator.next();
            if (current % 2 == 0) {
                next = current;
                return;
            }
        }
        next = null;
    }


}