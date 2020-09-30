package com.sample.sort.b.bubble;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MainLambda {
    public static void swap(int[] list, int iIndex, int jIndex) {
        int temp = list[iIndex];

        list[iIndex] = list[jIndex];
        list[jIndex] = temp;

    }

    public static void bubbleSort(int[] listSort){
        for (int i = listSort.length - 1; i > 0; i--){
            System.out.println("\ni = " + i);

            for (int j = 0 ; j < i; j++){
                if (listSort[j] > listSort[j + 1]){
                    swap(listSort, j, j + 1);

                    System.out.println("Swapping: " + j + " and " + (j + 1) + " ");
                    System.out.println(Arrays.toString(listSort));
                }
            }
        }
    }

    public static void main(String[] args) {
        int unsortedList[] = new int[] {60, 70, 80, 40, 30, 90, 120, 50, 100, 110};

        System.out.println(Arrays.toString(unsortedList));
        int n = unsortedList.length;
        IntStream.range(0, n - 1)
                .flatMap(i -> IntStream.range(1, n - i))
                .forEach(j -> {
                    if (unsortedList[j - 1] > unsortedList[j]) {
                        int temp = unsortedList[j];
                        unsortedList[j] = unsortedList[j - 1];
                        unsortedList[j - 1] = temp;
                    }
                });
        System.out.println(Arrays.toString(unsortedList));

//        bubbleSort(unsortedList);
    }
}
