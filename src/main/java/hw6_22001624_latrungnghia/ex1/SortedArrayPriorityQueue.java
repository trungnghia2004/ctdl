package hw6_22001624_latrungnghia.ex1;

public class SortedArrayPriorityQueue < K extends Comparable , E > implements PriorityQueueInterface {
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

    public SortedArrayPriorityQueue() {
        array = (ArrEntry<K, E>[]) new ArrEntry[defaultsize];
    }
    public int size(){
        return n;
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public void insert(Entry<K, E> entry){
        if(n> defaultsize){
            System.out.println("Can't insert");
        }else {
            int i = n - 1;
            while (i >= 0 && array[i].getKey().compareTo(entry.getKey()) < 0) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = new ArrEntry<>(entry.getKey(), entry.getValue());
            n++;
        }
    }

    public void insert(K k, E e){
        insert(new ArrEntry<>(k, e));
    }

    public Entry<K, E> removeMin(){
        if(isEmpty()){
            return null;
        }
        Entry<K, E> minEntry = array[n - 1];
        array[n - 1] = null;
        n--;
        return minEntry;
    }

    public Entry<K, E> min(){
        if (isEmpty()){
            return null;
        }
        return array[n-1];
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