package hw6_22001624_latrungnghia.ex3;

public class HeapSort<K extends Comparable, E> {


    private static class ArrEntry<K, E> {
        private K key;
        private E element;

        public ArrEntry(K key, E element) {
            this.key = key;
            this.element = element;
        }

        public K getKey() {
            return key;
        }

        public E getElement() {
            return element;
        }
    }

    ArrEntry<K, E>[] heap;

    int n = 0;

    public HeapSort(int n) {
        heap = new ArrEntry[n];
    }

    public void insert(ArrEntry<K, E> entry) {
        heap[n] = new ArrEntry<>(entry.getKey(), entry.getElement());
        n++;
    }

    public void insert(K k, E e) {
        insert(new ArrEntry<>(k, e));
    }
    long executionTime = 0;
    public void sort() {
        long startTime = System.currentTimeMillis();
        int N = heap.length;
        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(heap, N, i);
        for (int i = N - 1; i > 0; i--) {
            ArrEntry<K, E> temp = heap[0];
            heap[0] = heap[i];
            heap[i] = temp;
            heapify(heap, i, 0);
        }
        long endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
    }

    void heapify(ArrEntry<K, E>[] arr, int N, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < N && arr[l].key.compareTo(arr[largest].key) >0 ) {
            largest = l;
        }
        if (r < N && arr[r].getKey().compareTo( arr[largest].getKey()) > 0) {
            largest = r;
        }
        if (largest != i) {
            ArrEntry<K, E> swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, N, largest);
        }
    }

    public void print() {
        for (int i = 0; i < heap.length; i++) {
            System.out.print(heap[i].key + " " + heap[i].element + " ");
        }
    }
}