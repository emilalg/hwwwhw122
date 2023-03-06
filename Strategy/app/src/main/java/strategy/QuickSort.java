package strategy;

public class QuickSort implements Strategy{
    @Override
    public void sort(int[] arr) {
        quickSort(arr);
    }

    private static void quickSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int left = 0;
        int right = arr.length - 1;
        quickSortHelper(arr, left, right);
    }

    private static void quickSortHelper(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = arr[(left + right) / 2];
        int i = left;
        int j = right;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (left < j) {
            quickSortHelper(arr, left, j);
        }
        if (right > i) {
            quickSortHelper(arr, i, right);
        }
    }

    @Override
    public String toString(){
        return "QuickSort";
    }

}
