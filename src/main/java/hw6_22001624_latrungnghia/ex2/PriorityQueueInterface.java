package hw6_22001624_latrungnghia.ex2;

public interface PriorityQueueInterface {

    public interface Entry<K, E> {
        K getKey();

        E getValue();
    }

    public interface PriorityQueueInterface2<K, E> {
        public int size();

        public boolean isEmpty();

        public void insert(Entry<K, E> entry);

        public void insert(K k, E e);

        public Entry<K, E> removeMin();

        public Entry<K, E> min();
    }
}
