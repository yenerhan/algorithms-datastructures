package com.yener.algoritmadatastructures.algorithm.array;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                //System.out.println(Arrays.toString(arr));
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, -5, -8};
        //Arrays.sort(arr);
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
