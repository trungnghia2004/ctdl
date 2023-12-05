package hw6_22001624_latrungnghia.ex2;

public class Test {
    public static void main(String[] args) {
        MinHeapPriorityQueue minHeapPriorityQueue = new MinHeapPriorityQueue();
        minHeapPriorityQueue.insert(1, "D");
        minHeapPriorityQueue.insert(3, "C");
        minHeapPriorityQueue.insert(10, "A");
        minHeapPriorityQueue.insert(2, "B");
        minHeapPriorityQueue.insert(11, "E");
        minHeapPriorityQueue.print();
        minHeapPriorityQueue.removeMin();
        System.out.println("(" + minHeapPriorityQueue.min().getKey() + "," + minHeapPriorityQueue.min().getValue() + ")");
    }
}
