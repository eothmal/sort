package com.sample.sort.e.merge;

import java.util.Arrays;

public class Main {
    public static void split(String[] listToSort, String[] listFirstHalf, String[] listSecondHalf) {
        int secondHalfStartIndex = listFirstHalf.length;

        for (int index = 0; index < listToSort.length; index++) {
            if (index < secondHalfStartIndex) {
                listFirstHalf[index] = listToSort[index];
            } else {
                listSecondHalf[index -secondHalfStartIndex] = listToSort[index];
            }
        }
    }

    public static void merge(String[] listToSort, String[] listFirstHalf, String[] listSecondHalf) {
        int mergeIndex = 0;

        int firstHalfIndex = 0;
        int secondHalfIndex = 0;

        while (firstHalfIndex < listFirstHalf.length &&
                secondHalfIndex < listSecondHalf.length) {

            if (listFirstHalf[firstHalfIndex].compareTo(listSecondHalf[secondHalfIndex]) < 0) {
                listToSort[mergeIndex] = listFirstHalf[firstHalfIndex];
                firstHalfIndex++;
            } else if (secondHalfIndex < listSecondHalf.length) {
                listToSort[mergeIndex] = listSecondHalf[secondHalfIndex];
                secondHalfIndex++;
            }
            mergeIndex++;
        }
        if (firstHalfIndex < listFirstHalf.length) {
            while (mergeIndex < listToSort.length) {
                listToSort[mergeIndex++] = listFirstHalf[firstHalfIndex++];
            }
        }
        if (secondHalfIndex < listSecondHalf.length){
            while (mergeIndex < listSecondHalf.length){
                listToSort[mergeIndex++] = listSecondHalf[secondHalfIndex++];
            }
        }
    }

    public static void mergeSort(String[] listToSort) {
        if (listToSort.length == 1) {
            return;
        }

        int midIndex = listToSort.length / 2 + listToSort.length % 2;

        String[] listFirstHalf = new String[midIndex];
        String[] listSecondHalf = new String[listToSort.length - midIndex];

        split(listToSort, listFirstHalf, listSecondHalf);

        System.out.println("\n Split: " + Arrays.toString(listFirstHalf) + "  " + Arrays.toString(listSecondHalf));

        mergeSort(listFirstHalf);
        mergeSort(listSecondHalf);

        merge(listToSort, listFirstHalf, listSecondHalf);

        System.out.println("\nMerged: " + Arrays.toString(listToSort));
    }


    public static void main(String[] args) {

        String unsortedList[] = new String[]{"Ferry", "Debie",
                "Alex", "Jim",
                "Ely", "Irina",
                "George", "Big",
                "Martha", "Chuck"};

        System.out.println(Arrays.toString(unsortedList));

        mergeSort(unsortedList);

    }
}
