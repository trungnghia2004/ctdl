package hw6_22001624_latrungnghia.ex3;

public class InsertionSort {

    long executionTime = 0;

    public void insertionSort(int[] arr) {
        int[] arr2 = new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        long startTime = System.currentTimeMillis();
        for (int i = 1; i < arr2.length; i++) {
            int value = arr2[i];
            int j;
            for (j = i - 1; j >= 0 && value < arr2[j]; j--) {
                arr2[j + 1] = arr2[j];
            }
            arr2[j + 1] = value;
        }
        long endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
    }

}
