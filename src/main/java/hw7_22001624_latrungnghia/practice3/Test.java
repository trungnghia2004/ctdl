package hw7_22001624_latrungnghia.practice3;

public class Test {
    public static void main(String[] args) {
        MedianBinaryTree medianBinaryTree = new MedianBinaryTree();
        medianBinaryTree.root = medianBinaryTree.insert(medianBinaryTree.root, 6);
        medianBinaryTree.insert(medianBinaryTree.root, 3);
        medianBinaryTree.insert(medianBinaryTree.root, 8);
        medianBinaryTree.insert(medianBinaryTree.root, 1);
        medianBinaryTree.insert(medianBinaryTree.root, 4);
        medianBinaryTree.insert(medianBinaryTree.root, 7);
        medianBinaryTree.insert(medianBinaryTree.root, 9);
        medianBinaryTree.median(medianBinaryTree.root);
        System.out.println(medianBinaryTree.isMedian());
    }
}
