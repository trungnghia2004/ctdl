package hw6_22001624_latrungnghia.ex1;

public class Test {
    public static void main(String[] args) {
        System.out.println("Unsorted Array Priority Queue: ");
        UnsortedArrayPriorityQueue unsortedArrayPriorityQueue = new UnsortedArrayPriorityQueue<>();
        unsortedArrayPriorityQueue.insert(5, "A");
        unsortedArrayPriorityQueue.insert(9, "C");
        unsortedArrayPriorityQueue.insert(3, "B");
        unsortedArrayPriorityQueue.print();
        System.out.print("Min :");
        System.out.println("(" + unsortedArrayPriorityQueue.min().getKey() + "," + unsortedArrayPriorityQueue.min().getValue() + ")");
        unsortedArrayPriorityQueue.removeMin();
        System.out.println("After remove Min: ");
        unsortedArrayPriorityQueue.print();
        System.out.println("=======================================");
        System.out.println("Sorted Array Priority Queue: ");
        SortedArrayPriorityQueue sortedArrayPriorityQueue = new SortedArrayPriorityQueue<>();
        sortedArrayPriorityQueue.insert(5, "A");
        sortedArrayPriorityQueue.insert(9, "C");
        sortedArrayPriorityQueue.insert(3, "B");
        sortedArrayPriorityQueue.print();
        System.out.print("Min: ");
        System.out.println("(" + sortedArrayPriorityQueue.min().getKey() + "," + sortedArrayPriorityQueue.min().getValue() + ")");
        sortedArrayPriorityQueue.removeMin();
        System.out.println("After remove Min: ");
        sortedArrayPriorityQueue.print();
        System.out.println("UnsortedLinkedPriorityQueue: ");
        UnsortedLinkedPriorityQueue unsortedLinkedPriorityQueue = new UnsortedLinkedPriorityQueue();
        unsortedLinkedPriorityQueue.insert(5, "A");
        unsortedLinkedPriorityQueue.insert(9, "C");
        unsortedLinkedPriorityQueue.insert(3, "B");
        unsortedLinkedPriorityQueue.print();
        System.out.print("Min: ");
        System.out.println("(" + unsortedLinkedPriorityQueue.min().getKey() + "," + unsortedLinkedPriorityQueue.min().getValue() + ")");
        System.out.println("After remove Min: ");
        unsortedLinkedPriorityQueue.removeMin();
        unsortedLinkedPriorityQueue.print();
        System.out.println("SortedLinkedPriorityQueue: ");
        SortedLinkedPriorityQueue sortedLinkedPriorityQueue = new SortedLinkedPriorityQueue();
        sortedLinkedPriorityQueue.insert(5, "A");
        sortedLinkedPriorityQueue.insert(9, "C");
        sortedLinkedPriorityQueue.insert(3, "B");
        sortedLinkedPriorityQueue.print();
        System.out.print("Min: ");
        System.out.println("(" + sortedLinkedPriorityQueue.min().getKey() + "," + sortedLinkedPriorityQueue.min().getValue() + ")");
        System.out.println("After remove Min: ");
        sortedLinkedPriorityQueue.removeMin();
        sortedLinkedPriorityQueue.print();
    }
}
