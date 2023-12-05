package hw7_22001624_latrungnghia.ex2;

public class SequentialSearch {

    long executionTime = 0;

    public void search(int[] arr,int data) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            if (data == arr[i]) {
                long endTime = System.currentTimeMillis();
                 executionTime = endTime - startTime;
                 return ;
            }
        }
        long endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
    }
}
