package com.sample.sort.c.insert;

import java.util.Arrays;

public class MainTest {
    public static void insertSort(int[] intArr) {
        for (int i = 0; i < intArr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                System.out.println("j: " + intArr[j] + " " + " j-1: " + intArr[j - 1]);
                if (intArr[j] < intArr[j - 1]) {
                    swap(intArr, j, j - 1);
                    System.out.println("j: " + j + " " + Arrays.toString(intArr));
                } else {
                    break;
                }

            }
        }
    }

    private static void swap(int[] intArr, int j, int i) {
        int temp = intArr[j];
        intArr[j] = intArr[i];
        intArr[i] = temp;
    }

    public static void main(String[] args) {

        int unsortedList[] = new int[]{60, 70, 80, 40, 30, 90, 120, 50, 100, 110};

        System.out.println(Arrays.toString(unsortedList));
        String test = "test";
        System.out.println(test);
        insertSort(unsortedList);
        System.out.println(Arrays.toString(unsortedList));
        test = "TEST";
        System.out.println(test);
    }
}
