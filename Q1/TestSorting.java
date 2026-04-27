package Q1;
import java.util.*;

public class TestSorting {

    public static ArrayList<Integer> generateList(int size) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(size) + 1);
        }

        return list;
    }

    public static long timeQuickSort(ArrayList<Integer> list) {
        long start = System.nanoTime();

        QuickSort.quickSort(list, 0, list.size() - 1);

        long end = System.nanoTime();
        return end - start;
    }

    public static long timeHybridSort(ArrayList<Integer> list) {
        long start = System.nanoTime();

        HybridSort.hybridQuickSort(list, 0, list.size() - 1);

        long end = System.nanoTime();
        return end - start;
    }

    public static long averageTime(ArrayList<Integer> original, int runs, boolean hybrid) {
        long total = 0;

        for (int i = 0; i < runs; i++) {
            ArrayList<Integer> copy = new ArrayList<>(original);

            if (hybrid) {
                total += timeHybridSort(copy);
            } else {
                total += timeQuickSort(copy);
            }
        }

        return total / runs;
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 5000, 10000, 50000, 75000, 100000, 500000};

        for (int size : sizes) {
            System.out.println("\nTesting size: " + size);

            ArrayList<Integer> randomList = generateList(size);

            ArrayList<Integer> sortedList = new ArrayList<>(randomList);
            Collections.sort(sortedList);

            ArrayList<Integer> reverseList = new ArrayList<>(sortedList);
            Collections.reverse(reverseList);

            int runs = 5;

            System.out.println("QuickSort Random: " +
                averageTime(randomList, runs, false));

            System.out.println("QuickSort Sorted: " +
                averageTime(sortedList, runs, false));

            System.out.println("QuickSort Reverse: " +
                averageTime(reverseList, runs, false));

            System.out.println("Hybrid Random: " +
                averageTime(randomList, runs, true));

            System.out.println("Hybrid Sorted: " +
                averageTime(sortedList, runs, true));

            System.out.println("Hybrid Reverse: " +
                averageTime(reverseList, runs, true));
        }
    }
}