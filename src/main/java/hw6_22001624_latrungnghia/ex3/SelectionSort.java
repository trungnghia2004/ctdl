package hw6_22001624_latrungnghia.ex3;

public class SelectionSort {

    long executionTime = 0;

    public void selectionSort(int[] arr) {
        int[] arr2 = new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr2.length - 1; ++i) {
            int minIdx = i;
            for (int j = i + 1; j < arr2.length; ++j) {
                if (arr2[minIdx] >= arr2[j]) {
                    minIdx = j;
                }
            }
            int temp = arr2[minIdx];
            arr2[minIdx] = arr2[i];
            arr2[i] = temp;
        }
        long endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
    }

}
