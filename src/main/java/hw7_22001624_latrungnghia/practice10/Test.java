package hw7_22001624_latrungnghia.practice10;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FindMax findMax = new FindMax();
        findMax.root = findMax.insert(findMax.root,5);
        findMax.insert(findMax.root,2);
        findMax.insert(findMax.root,12);
        findMax.insert(findMax.root,1);
        findMax.insert(findMax.root,3);
        findMax.insert(findMax.root,9);
        findMax.insert(findMax.root,21);
        findMax.insert(findMax.root,19);
        findMax.insert(findMax.root,25);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.print("Largest element value that does not exceed N: ");
        System.out.println(findMax.findMaxForN(findMax.root,n));
    }
}
