package hw7_22001624_latrungnghia.practice7;

public class Test {
    public static void main(String[] args) {
        MinBinaryTree minBinaryTree = new MinBinaryTree();
        minBinaryTree.root = minBinaryTree.insert(minBinaryTree.root,5);
        minBinaryTree.insert(minBinaryTree.root,4);
        minBinaryTree.insert(minBinaryTree.root,6);
        minBinaryTree.insert(minBinaryTree.root,3);
        minBinaryTree.insert(minBinaryTree.root,7);
        minBinaryTree.insert(minBinaryTree.root,1);
        System.out.println(minBinaryTree.min(minBinaryTree.root));

        MinBinaryTree minBinaryTree2 = new MinBinaryTree();
        minBinaryTree2.root = minBinaryTree2.insert(minBinaryTree2.root,9);
        minBinaryTree2.insert(minBinaryTree2.root,10);
        minBinaryTree2.insert(minBinaryTree2.root,11);
        System.out.println(minBinaryTree2.min(minBinaryTree2.root));
    }
}
