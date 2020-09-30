package com.sample.sort.a.selection;

import java.util.Arrays;

public class MainTest {

    public static void swap(int[] intArr, int i, int j){

        int temp = intArr[i];
        intArr[i] = intArr[j];
        intArr[j] = temp;
    }
    public static void selectionSort(int[] intArr){
        for (int i = 0; i < intArr.length; i++){

            for ( int j = i; j < intArr.length; j++){

                if (intArr[i] > intArr[j]){
                    swap(intArr, j, i);
                }

            }
        }
    }

    public static void main(String[] args) {
        int unsortedList[] = new int[] {60, 70, 80, 40, 30, 90, 120, 50, 100, 110};
        System.out.println(Arrays.toString(unsortedList));
        selectionSort(unsortedList);
        System.out.println(Arrays.toString(unsortedList));
    }
}
