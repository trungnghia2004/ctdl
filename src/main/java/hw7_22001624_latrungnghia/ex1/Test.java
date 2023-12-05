package hw7_22001624_latrungnghia.ex1;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the capacity: ");
        int capacity = in.nextInt();
        System.out.println("UnSortedArrayList");
        UnSortedArrayList unSortedArrayList = new UnSortedArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            unSortedArrayList.add(random.nextInt(50) + 1);
        }
        System.out.println(unSortedArrayList);
        System.out.println("Search data: ");
        int n = in.nextInt();
        System.out.println(unSortedArrayList.isContain(n));
        System.out.println("=============================");
        System.out.println("SortedArrayList: ");
        SortedArrayList sortedArrayList = new SortedArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            sortedArrayList.add(random.nextInt(50) + 1);
        }
        System.out.println(sortedArrayList);
        System.out.println("Search data: ");
        int n2 = in.nextInt();
        System.out.println(sortedArrayList.isContain(n2));
        System.out.println("=======================");
        System.out.println(" UnSortedLinkedList");
        UnSortedLinkedList unSortedLinkedList = new UnSortedLinkedList();
        for (int i = 0; i < capacity; i++) {
            unSortedLinkedList.add(random.nextInt(50) + 1);
        }
        unSortedLinkedList.printLinkList();
        System.out.println("Search data:");
        int n3 = in.nextInt();
        System.out.println(unSortedLinkedList.isContain(n3));
        System.out.println("=======================");
        System.out.println("SortedLinkedList");
        SortedLinkedList sortedLinkedList = new SortedLinkedList();
        for (int i = 0; i < capacity; i++) {
            sortedLinkedList.add(random.nextInt(50) + 1);
        }
        sortedLinkedList.printLinkList();
        System.out.println("Search data:");
        int n4 = in.nextInt();
        System.out.println(sortedLinkedList.isContain(n4));
        System.out.print("Insert index:");
        int index = in.nextInt();
        System.out.print("data:");
        int data = in.nextInt();
        sortedLinkedList.set(index, data);
        sortedLinkedList.printLinkList();
    }
}
