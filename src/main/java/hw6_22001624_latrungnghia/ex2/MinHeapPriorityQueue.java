package hw6_22001624_latrungnghia.ex2;

public class MinHeapPriorityQueue<K extends Comparable, E> extends SortedArrayPriorityQueue<K, E> {

    ArrEntry<K, E>[] heapPQ;

    protected void upHeap() {
        int currentIndex = n - 1;
        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;
            if (array[currentIndex].getKey().compareTo(array[parentIndex].getKey()) < 0) {
                swap(currentIndex, parentIndex);
                currentIndex = parentIndex;
            } else {
                break;
            }
        }

    }

    protected void downHeap() {
        int currentIndex = 0;

        while (currentIndex * 2 + 1 < n) {
            int leftIndex = 2 * currentIndex + 1;
            int rightIndex = 2 * currentIndex + 2;
            int smalIndex = currentIndex;

            if (leftIndex < n && array[leftIndex].getKey().compareTo(array[smalIndex].getKey()) < 0) {
                smalIndex = leftIndex;
            }

            if (rightIndex < n && array[rightIndex].getKey().compareTo(array[smalIndex].getKey()) < 0) {
                smalIndex = rightIndex;
            }

            if (smalIndex != currentIndex) {
                swap(currentIndex, smalIndex);
                currentIndex = smalIndex;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        ArrEntry<K, E> temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}