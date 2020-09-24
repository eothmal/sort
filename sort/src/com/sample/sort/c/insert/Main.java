package com.sample.sort.c.insert;

import java.util.Arrays;

public class Main {

    public static void swap(int[] listSort, int iIndex, int jIndex){
        int temp = listSort[iIndex];

        listSort[iIndex] = listSort[jIndex];
        listSort[jIndex] = temp;
    }

    public static void insertSort(int[] listToSort){
        for ( int i = 0; i < listToSort.length -1; i++){
            System.out.println("\ni = " + i);

            for (int j = i+1; j > 0; j--){

                if (listToSort[j] < listToSort[j-1]){

                swap(listToSort, j, j - 1);

                System.out.println("Swapping " + j + " and " + ( j - 1 ) + " ");
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

        insertSort(unsortedList);

    }
}



