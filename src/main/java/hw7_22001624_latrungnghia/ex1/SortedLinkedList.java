package hw7_22001624_latrungnghia.ex1;

public class SortedLinkedList<T> {
    class Node {
        T data;
        Node next;
    }

    private Node top = null;
    private Node bot = null;
    private int n = 0;

    public void add(T data) {
        sort(data);
    }

    public T get(int i) {
        if (!checkBoundaries(i, n)) {
            System.out.println("Can't get object at index " + i);
            return null;
        }
        Node tmp = top;
        int j = 0;

        while (j < i) {
            tmp = tmp.next;
            j++;
        }
        return tmp.data;
    }


    public void set(int i, T data) {
        if (!checkBoundaries(i, n)) {
            System.out.println("Can't set data " + data + " at index " + i);
        } else {
            Node tmp = top;
            int j = 0;

            while (j < i) {
                tmp = tmp.next;
                j++;
            }
            remove(tmp.data);
            sort(data);
        }
    }

    public void sort(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if (isEmpty()) {
            top = newNode;
            bot = newNode;
        } else if (Integer.valueOf((Integer) top.data) > Integer.valueOf((Integer) newNode.data)) {
            newNode.next = top;
            top = newNode;
        } else {
            Node current = top;
            Node prev = null;
            while (current != null && Integer.valueOf((Integer) current.data) <= Integer.valueOf((Integer) newNode.data)) {
                prev = current;
                current = current.next;
            }
            if (current == null) {
                prev.next = newNode;
                bot = newNode;
            } else {
                prev.next = newNode;
                newNode.next = current;
            }
        }
        n++;
    }

    public boolean isContain(T data) {
        Node tmp = top;

        while (tmp != null) {
            if (tmp.data.equals(data)) {
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public void remove(T data) {
        if (n == 0) {
            return;
        }
        if (top.data.equals(data)) {
            top = top.next;
            n--;
            return;
        }
        Node current = top;
        Node previous = null;

        while (current != null) {
            if (current.data.equals(data)) {
                previous.next = current.next;
                n--;
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    public boolean checkBoundaries(int index, int limit) {
        return index <= limit && index >= 0;
    }

    public void printLinkList() {
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(get(i) + " ");
        }
        System.out.println("]");
    }
}