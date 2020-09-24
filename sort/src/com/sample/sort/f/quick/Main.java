package com.sample.sort.f.quick;

import java.util.Arrays;

public class Main {
    public static void swap(String[] list, int i, int j) {
        String temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    public static int partition(String[] listToSort, int low, int high) {
        String pivot = listToSort[low];
        int l = low;
        int h = high;
        System.out.println("\nPivot = " + pivot);
        while (l < h) {
            while (listToSort[l].compareTo(pivot) <= 0 && l < h) {
                l++;
            }
            while (listToSort[h].compareTo(pivot) > 0) {
                h--;
            }
            if (l < h) {
                swap(listToSort, l, h);
                System.out.println("Swapping: " + l + " and " + h + " ");
                System.out.println(Arrays.toString(listToSort));
            }
        }
        swap(listToSort, low, h);
        System.out.println("Swapping: " + low + " and " + h + " ");
        System.out.println(Arrays.toString(listToSort));

        System.out.println("\nPartitioned: " + Arrays.toString(listToSort) +
                " around pivot: " + pivot);
        return h;

    }

    public static void quickSort(String[] listToSort, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivotIndex = partition(listToSort, low, high);
        quickSort(listToSort, low, pivotIndex - 1);
        quickSort(listToSort, pivotIndex + 1, high);
    }

    public static void main(String[] args) {

        String[] unsortedList = new String[]{"Ferry", "Debbie",
                "Alex", "Jim",
                "Ely", "Irina",
                "George", "Big",
                "Martha", "Chuck"};

        System.out.println(Arrays.toString(unsortedList));

        quickSort(unsortedList, 0, unsortedList.length - 1);
        System.out.println("\n" + Arrays.toString(unsortedList));
    }
}
