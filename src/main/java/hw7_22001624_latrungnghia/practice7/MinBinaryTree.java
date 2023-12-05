package hw7_22001624_latrungnghia.practice7;


public class MinBinaryTree {
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node root;

    public Node insert(Node node, int key) {
        if (node == null) {
            node = new Node(key);
            return node;
        }
        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);

        }
        return node;
    }

    public int min(Node node) {
        if (node == null) {
            return -1;
        }
        while (node.left != null){
            node = node.left;
        }
        return node.key;
    }
}
