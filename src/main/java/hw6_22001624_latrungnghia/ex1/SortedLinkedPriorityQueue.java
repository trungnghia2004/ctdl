package hw6_22001624_latrungnghia.ex1;

public class SortedLinkedPriorityQueue < K extends Comparable , E > implements PriorityQueueInterface {
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
    public int size(){
        return n;
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public void insert(Entry<K, E> entry){
        NodeEntry<K,E> newNode = new NodeEntry<>();
         newNode.key = entry.getKey();
         newNode.element = entry.getValue();
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else  if (head.key.compareTo(entry.getKey())>0){
            newNode.next = head;
            head = newNode;
        }else {
            NodeEntry<K,E> current = head;
            NodeEntry<K,E> prev = null;
            while (current != null && current.key.compareTo(entry.getKey())<=0){
                prev = current;
                current = current.next;
            }
            if(current == null){
                prev.next = newNode;
                tail = newNode;
            }else {
                prev.next = newNode;
                newNode.next = current;
            }
        }
        n++;
    }

    public void insert(K k, E e){
        insert(new NodeEntry<>(k, e));
    }

    public Entry<K, E> removeMin(){
        head = head.next;
        return head;
    }

    public Entry<K, E> min(){
        return head;
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