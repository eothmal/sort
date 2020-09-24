package com.sample.sort.b.bubble;

import java.util.Arrays;

public class MainEarlyStop {
    public static void swap(int[] list, int iIndex, int jIndex) {
        int temp = list[iIndex];

        list[iIndex] = list[jIndex];
        list[jIndex] = temp;

    }

    public static void bubbleSort(int[] listSort){
        for (int i = listSort.length - 1; i > 0; i--){

            boolean swapped = false;

            System.out.println("\ni = " + i);

            for (int j = 0 ; j < i; j++){
                if (listSort[j] > listSort[j + 1]){
                    swap(listSort, j, j + 1);
                    swapped = true;

                    System.out.println("Swapping: " + j + " and " + (j + 1) + " ");
                    System.out.println(Arrays.toString(listSort));
                }
                if (swapped){
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int unsortedList[] = new int[] {60, 70, 80, 40, 30, 90, 120, 50, 100, 110};

        System.out.println(Arrays.toString(unsortedList));
        bubbleSort(unsortedList);
    }
}
