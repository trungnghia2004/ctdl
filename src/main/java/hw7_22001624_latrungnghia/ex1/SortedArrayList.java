package hw7_22001624_latrungnghia.ex1;

import java.util.Arrays;
import java.util.Iterator;

public class SortedArrayList<T> implements ListInterface<T> {
    private T[] array;
    private int n = 0;
    private int defaultSize = 100;

    public SortedArrayList() {
        array = (T[]) new Object[defaultSize];
    }

    public SortedArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }
        array = (T[]) new Object[capacity];
    }

    @Override
    public void add(T data) {
        if (size() == array.length) {
            enlarge();
        }
        if (isEmpty()) {
            array[n++] = data;
        } else {
            array[n++] = data;
            sort();
        }
    }

    @Override
    public T get(int i) {
        if (i < 0 || i >= size())
            return null;
        return array[i];

    }

    @Override
    public void set(int i, T data) {
        if (i >= 0 && i < size()) {
            array[i] = data;
            sort();
        } else {
            System.out.println("Can't set data " + data + " at index: " + i);
        }
    }

    @Override
    public boolean isContain(T data) {
        for (int i = 0; i < size(); i++) {
            if (array[i].equals(data)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < n;
            }

            @Override
            public T next() {
                if (hasNext()) {
                    return array[index++];
                }
                return null;
            }
        };
    }

    private void enlarge() {
        array = Arrays.copyOf(array, array.length * 2);
    }

    public String toString() {
        String s = "[";
        for (int i = 0; i < size(); i++) {
            s += get(i) + " ";
        }
        s += "]";
        return s;
    }

    private void sort() {
        for (int i = 1; i < size(); ++i) {
            boolean check = true;
            for (int j = 0; j < size() - 1; ++j) {
                if (Integer.valueOf((Integer) array[j+1]) < Integer.valueOf((Integer) array[j])) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    check = false;

                }
            }
            if (check) {
                return;
            }
        }
    }
}
