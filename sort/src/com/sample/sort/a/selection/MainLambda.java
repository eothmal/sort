package com.sample.sort.a.selection;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MainLambda {

    public static void swap(int[] list, int iIndex, int jIndex) {
        int temp = list[iIndex];

        list[iIndex] = list[jIndex];
        list[jIndex] = temp;

    }

    public static void selectionSort(int[] listToSort) {
        for (int i = 0; i < listToSort.length; i++) {
            System.out.println("\ni = " + i);

            for (int j = i + 1; j < listToSort.length; j++) {
                if (listToSort[i] > listToSort[j]) {
                    swap(listToSort, i, j);

                    System.out.println("Swapping: " + i + " and " + j + " ");
                    System.out.println(Arrays.toString(listToSort));
                }

            }
        }


    }

    public static void main(String[] args) {
        int unsortedList[] = new int[]{60, 70, 80, 40, 30, 90, 120, 50, 100, 110};

        System.out.println(Arrays.toString(unsortedList));
        int n = unsortedList.length;
        IntStream.range(0, n - 1)
                .flatMap(i -> IntStream.range(1, n - i))
                .forEach(j -> {
                    if (j == 1) System.out.println("\nj " + j);
                    else  System.out.println("j " + j);
//                    System.out.println("n " + n);
                    if (unsortedList[j - 1] > unsortedList[j]) {
                        int temp = unsortedList[j];
                        unsortedList[j] = unsortedList[j - 1];
                        unsortedList[j - 1] = temp;
        System.out.println("Swapped: " + unsortedList[j] + " " + unsortedList[j-1] + " " + Arrays.toString(unsortedList));
                    }
                });

        System.out.println(Arrays.toString(unsortedList));
//        selectionSort(unsortedList);

    }
}
