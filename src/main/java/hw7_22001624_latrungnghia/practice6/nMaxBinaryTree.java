package hw7_22001624_latrungnghia.practice6;

public class nMaxBinaryTree {
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
int count = 0;
    public int KthSmallestElement(Node node, int K) {
        if (node == null || count >= K) {
            return -1;
        }
        int right = KthSmallestElement(node.right,K);
        if(count < K){
            count++;
            if(count == K){
                return  node.key;
            }
        }
        int left = KthSmallestElement(node.left,K);
        if(right != -1){
            return right;
        }else {
            return left;
        }
    }
}
