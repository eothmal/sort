package com.sample.sort.d.shell;

import java.util.Arrays;

public class Main {

    public static void swap(int[] listToSort, int iIndex, int jIndex) {
        int temp = listToSort[iIndex];

        listToSort[iIndex] = listToSort[jIndex];
        listToSort[jIndex] = temp;
    }

    public static void shellSort(int[] listToSort) {
        int increment = listToSort.length / 2;
        while (increment >= 1) {
            insertSort(listToSort, increment);
            increment = increment /2 ;
        }
    }

    public static void insertSort(int[] listToSort, int increment) {
        for (int i = 0; i + increment < listToSort.length; i = i + 1) {
            System.out.println("\ni = " + i + " increment = " + increment);

            for (int j = i + increment; j - increment >= 0; j = j - increment) {
                if (listToSort[j] < listToSort[j - increment]) {
                    swap(listToSort, j, j - 1);
                    System.out.println("Swapping " + j + " and " + (j - increment) + " ");
                    System.out.println(Arrays.toString(listToSort));
                } else {
                    break;
                }

            }
        }
    }

    public static void main(String[] args) {

        int unsortedList[] = new int[]{60, 70, 80, 40, 30, 90, 120, 50, 100, 110};

        System.out.println(Arrays.toString(unsortedList));

        shellSort(unsortedList);

    }
}



