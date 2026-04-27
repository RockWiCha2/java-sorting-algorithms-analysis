package Q1;

import java.util.ArrayList;

public class HybridSort {

    private static final int THRESHOLD = 50;

    public static void hybridQuickSort(ArrayList<Integer> arr, int low, int high) {
        // Base case
        if (low >= high) return;

        // Use insertion sort for small subarrays
        if (high - low < THRESHOLD) {
            insertionSort(arr, low, high);
            return;
        }

        int pi = partition(arr, low, high);

        // 🔥 Prevent unbalanced recursion causing stack overflow
        if (pi == low) {
            hybridQuickSort(arr, low + 1, high);
        } else if (pi == high) {
            hybridQuickSort(arr, low, high - 1);
        } else {
            hybridQuickSort(arr, low, pi - 1);
            hybridQuickSort(arr, pi + 1, high);
        }
    }

    private static int partition(ArrayList<Integer> arr, int low, int high) {
        // Use middle element as pivot
        int mid = (low + high) / 2;
        swap(arr, mid, high);

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

    private static void insertionSort(ArrayList<Integer> arr, int low, int high) {
        for (int i = low + 1; i <= high; i++) {
            int key = arr.get(i);
            int j = i - 1;

            while (j >= low && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));
                j--;
            }

            arr.set(j + 1, key);
        }
    }

    private static void swap(ArrayList<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
}