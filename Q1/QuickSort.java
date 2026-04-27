package Q1;
import java.util.ArrayList;

public class QuickSort {

    public static void quickSort(ArrayList<Integer> arr, int low, int high) {
        if (low >= high) return; // base case

        int pi = partition(arr, low, high);

        // 🔥 Prevent worst-case recursion depth
        if (pi == low) {
            quickSort(arr, low + 1, high);
        } else if (pi == high) {
            quickSort(arr, low, high - 1);
        } else {
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(ArrayList<Integer> arr, int low, int high) {
        // Random pivot
        int pivotIndex = low + (int)(Math.random() * (high - low + 1));
        swap(arr, pivotIndex, high);

        int pivot = arr.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr.get(j) <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(ArrayList<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
}