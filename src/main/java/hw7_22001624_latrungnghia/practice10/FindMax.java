package hw7_22001624_latrungnghia.practice10;

public class FindMax {
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

    int max;

    public int findMaxForN(Node node, int val) {
        if (node == null) {
            return max;
        }
        if (val <= node.key) {
            if(max < node.key  && node.key <= val){
                max = node.key;
            }
            findMaxForN(node.left, val);
        } else if (val >= node.key) {
            if(max < node.key  && node.key <= val){
                max = node.key;
            }
            findMaxForN(node.right, val);
        }
        return max;
    }
}
