package hw7_22001624_latrungnghia.ex2;

public class BinarySearch {
    long executionTime = 0;

    public void isQuickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIdx = partition(arr, left, right);
            quickSort(arr, left, pivotIdx - 1);
            quickSort(arr, pivotIdx + 1, right);
        }
    }

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public void search(int[] arr, int x) {
        int[] arr2 = new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        isQuickSort(arr2);
        check(arr2,0,arr2.length-1,x);
    }
    long sumTime = 0;
    public long check(int[] arr,int l, int r,int x) {
        long startTime = System.currentTimeMillis();
        if(r >= l){
            int mid = (r+l)/2;
            if(arr[mid] == x){
                long endTime = System.currentTimeMillis();
                sumTime += (endTime - startTime);
                return executionTime = sumTime;
            }else if (arr[mid] < x){
                long endTime = System.currentTimeMillis();
                sumTime += (endTime- startTime);
                return check(arr,mid+1,r,x);
            }else {
                long endTime = System.currentTimeMillis();
                sumTime += (endTime- startTime);
                return check(arr,l,mid-1,x);
            }
        }
        long endTime = System.currentTimeMillis();
        sumTime += (endTime- startTime);
        return executionTime = sumTime;
    }
}
