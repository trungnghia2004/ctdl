package hw6_22001624_latrungnghia.ex1;

public class UnsortedArrayPriorityQueue<K extends Comparable, E> implements PriorityQueueInterface {
    protected class ArrEntry<K, E> implements Entry<K, E> {
        K key;
        E element;

        public ArrEntry(K k, E e) {
            this.key = k;
            this.element = e;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public E getValue() {
            return element;
        }
    }

    ArrEntry<K, E>[] array;
    int n = 0;
    int defaultsize = 1000;

    public UnsortedArrayPriorityQueue() {
        array = (ArrEntry<K, E>[]) new ArrEntry[defaultsize];
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public void insert(Entry<K, E> entry) {
        if (n > defaultsize) {
            System.out.println("Can't insert");
        } else {
            array[n] = new ArrEntry<>(entry.getKey(), entry.getValue());
            n++;
        }
    }

    public void insert(K k, E e) {
        insert(new ArrEntry<>(k, e));
    }

    public Entry<K, E> removeMin() {
        if (isEmpty()) {
            return null;
        }
        int minIdx = 0;
        for (int i = 1; i < n; i++) {
            if (array[i].key.compareTo(array[minIdx].key) < 0) {
                minIdx = i;
            }
        }
        Entry<K, E> min = array[minIdx];
        for (int i = minIdx; i < n - 1; i++) {
            array[i] = array[i + 1];
        }
        array[n - 1] = null;
        n--;
        return min;
    }

    public Entry<K, E> min() {
        if (isEmpty()) {
            return null;
        }
        Entry<K, E> min = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i].getKey().compareTo(min.getKey()) < 0) {
                min = array[i];
            }
        }
        return min;
    }
    public void print(){
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print("(" + array[i].key + "," + array[i].element + ")" + " ");
            } else {
                System.out.print("(" + array[i].key + "," + array[i].element + ")" + ", ");
            }
        }
        System.out.println();
    }

}
