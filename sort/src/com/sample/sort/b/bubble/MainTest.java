package com.sample.sort.b.bubble;

import java.util.Arrays;

public class MainTest {
    public static void bubleSort(int[] intArr) {

        for (int i = intArr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++)
                if (intArr[j] > intArr[j + 1]) {
                    System.out.println("swapped: " + intArr[j] + " " + intArr[j + 1]);
                    swap(intArr, j, j + 1);
                    System.out.println(Arrays.toString(intArr));
                }
        }
    }

    public static void main(String[] args) {
        int unsortedList[] = new int[]{60, 70, 80, 40, 30, 90, 120, 50, 100, 110};

        System.out.println(Arrays.toString(unsortedList));
        bubleSort(unsortedList);
        System.out.println(Arrays.toString(unsortedList));
    }

    public static void swap(int[] intArr, int j, int i) {
        int temp = intArr[j];
        intArr[j] = intArr[i];
        intArr[i] = temp;
    }
}