package hw6_22001624_latrungnghia.ex3;

public class BubbleSort {
    long executionTime = 0;

    public void bubbleSort(int[] arr) {
        int[] arr2 = new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        long startTime = System.currentTimeMillis();
        for (int i = 1; i < arr2.length; ++i) {
            boolean check = true;
            for (int j = 0; j < arr2.length - 1; ++j) {
                if (arr2[j + 1] < arr2[j]) {
                    int temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                    check = false;
                }
            }
            if (check) {
                long endTime = System.currentTimeMillis();
                executionTime = endTime - startTime;
                return;
            }
        }
        long endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
    }


}
