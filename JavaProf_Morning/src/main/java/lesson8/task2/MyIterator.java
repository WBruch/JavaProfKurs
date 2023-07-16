package lesson8.task2;

import java.util.ListIterator;

public class MyIterator implements ListIterator<String> {

    private Node current;

    public MyIterator(Node current) {
        this.current = current;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public String next() {
        String value = current.getValue();
        current = current.getNext();
        return value;
    }

    @Override
    public boolean hasPrevious() {
        return current != null;
    }

    @Override
    public String previous() {
        String value = current.getValue();
        current = current.getPrevious();
        return value;
    }

    @Override
    public int nextIndex() {
        while (current != null) {
            int index = 0;
            current = current.getNext();
           return index++;
        }
        return 0;
    }

    @Override
    public int previousIndex() {
        return 0;
    }

    @Override
    public void remove() {

    }

    @Override
    public void set(String s) {

    }

    @Override
    public void add(String s) {

    }
}
