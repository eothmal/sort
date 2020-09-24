package com.sample.sort.a.insert;

import java.util.Arrays;

public class Main {

    public static void swap(int[] list, int iIndex, int jIndex) {
        int temp = list[iIndex];

        list[iIndex] = list[jIndex];
        list[jIndex] = temp;

    }

    public static  void selectionSort(int[] listToSort){
        for (int i = 0; i < listToSort.length; i++){
            System.out.println("\ni = " + i);

            for (int j = i + 1; j < listToSort.length; j++){
                if ( listToSort[i] > listToSort[j]){
                    swap(listToSort, i, j);

                    System.out.println("Swapping: " + i + " and " + j + " ");
                    System.out.println(Arrays.toString(listToSort));
                }

            }
        }


    }

    public static void main(String[] args) {
        int unsortedList[] = new int[] {60, 70, 80, 40, 30, 90, 120, 50, 100, 110};

        System.out.println(Arrays.toString(unsortedList));
        selectionSort(unsortedList);

    }
}
