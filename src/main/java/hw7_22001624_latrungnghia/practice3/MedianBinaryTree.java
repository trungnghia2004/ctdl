package hw7_22001624_latrungnghia.practice3;

import java.util.ArrayList;

public class MedianBinaryTree {
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node root;
    int n = 0;

    public Node insert(Node node, int key) {
        if (node == null) {
            node = new Node(key);
            n++;
            return node;
        }
        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);

        }
        return node;
    }

    int median;
    ArrayList<Integer> arrayList = new ArrayList<>();

    public void median(Node node) {
        if (node == null) {
            return;
        }
        median(node.left);
        arrayList.add(node.key);
        median(node.right);
    }

    public int isMedian() {
        if(n%2 != 0){
            return arrayList.get((n-1)/2);
        }else {
            int med1 = arrayList.get(n/2);
            int med2 = arrayList.get(n/2 - 1);
            return (med1 + med2)/2;
        }
    }
}
