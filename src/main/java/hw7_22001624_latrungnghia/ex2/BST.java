package hw7_22001624_latrungnghia.ex2;

public class BST {
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
        } else {
            node.right = insert(node.right, key);
        }
        return node;
    }

    public int FindMin(Node node) {
        if (node == null) {
            return -1;
        }
        while (node.left != null) {
            node = node.left;
        }
        return node.key;
    }

    long executionTime = 0;

    public void isSearch(int x) {
        long startTime = System.currentTimeMillis();
        Search(root, x);
        long endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
    }

    public Node Search(Node node, int x) {
        if (node == null || node.key == x) {
            return node;
        }
        if (x < node.key) {
            return Search(node.left, x);
        }
        return Search(node.right, x);
    }

    public Node Delete(Node node, int key) {
        if (node == null) {
            return node;
        }
        if (node.key > key) {
            node.left = Delete(node.left, key);
            return node;
        } else if (node.key < key) {
            node.right = Delete(node.right, key);
            return node;
        }
        if (node.left == null) {
            Node temp = node.right;
            return temp;
        } else if (node.right == null) {
            Node temp = node.left;
            return temp;
        } else {
            Node succParent = node;
            Node succ = node.right;
            while (succ.left != null) {
                succParent = succ;
                succ = succ.left;
            }
            if (succParent != node)
                succParent.left = succ.right;
            else
                succParent.right = succ.right;
            node.key = succ.key;
            return node;
        }
    }
}
