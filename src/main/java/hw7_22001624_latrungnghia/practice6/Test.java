package hw7_22001624_latrungnghia.practice6;

public class Test {
    public static void main(String[] args) {
        nMaxBinaryTree nMaxBinaryTree = new nMaxBinaryTree();
        nMaxBinaryTree.root = nMaxBinaryTree.insert(nMaxBinaryTree.root,4);
        nMaxBinaryTree.insert(nMaxBinaryTree.root, 2);
        nMaxBinaryTree.insert(nMaxBinaryTree.root, 9);
       System.out.println( nMaxBinaryTree.KthSmallestElement(nMaxBinaryTree.root, 3));

    }
}
