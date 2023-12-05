package hw6_22001624_latrungnghia.ex1;

public class UnsortedLinkedPriorityQueue<K extends Comparable, E> implements PriorityQueueInterface {
    protected class NodeEntry<K, E> implements Entry<K, E> {
        private K key;
        private E element;
        private NodeEntry<K, E> next;

        public NodeEntry() {
        }

        public NodeEntry(K k, E e) {
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

    private NodeEntry<K, E> head;
    private NodeEntry<K, E> tail;
    int n = 0;

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public void insert(Entry<K, E> entry) {
        NodeEntry<K, E> newNode = new NodeEntry<>();
        newNode.element = entry.getValue();
        newNode.key = entry.getKey();
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        n++;
    }

    public void insert(K k, E e) {
        insert(new NodeEntry<>(k, e));
    }

    public Entry<K, E> removeMin() {
        if (isEmpty()) {
            return null;
        }
        NodeEntry<K, E> minNode = head;
        NodeEntry<K, E> current = head;
        NodeEntry<K, E> prevMin = null;
        NodeEntry<K, E> prevCurrent = null;
        while (current != null) {
            if (minNode.getKey().compareTo(current.getKey()) > 0) {
                prevMin = prevCurrent;
                minNode = current;
            }
            prevCurrent = current;
            current = current.next;
        }
        if (prevMin != null) {
            prevMin.next = minNode.next;
        } else {
            head = minNode.next;
        }
        n--;
        return minNode;
    }

    public Entry<K, E> min() {
        if (isEmpty()) {
            return null;
        }
        NodeEntry<K, E> current = head;
        NodeEntry<K, E> minNode = head;
        while (current != null) {
            if (minNode.getKey().compareTo(current.getKey()) > 0) {
                minNode = current;
            }
            current = current.next;
        }
        return minNode;
    }
    public void print(){
        NodeEntry<K,E> current = head;
       while (current != null){
            System.out.print("(" + current.key + "," + current.element + ")");
            current = current.next;
        }
        System.out.println();
    }
}