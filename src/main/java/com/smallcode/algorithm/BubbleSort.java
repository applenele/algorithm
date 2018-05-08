package com.smallcode.algorithm;

import com.smallcode.util.PrintUtils;

public class BubbleSort {


    public int[] sort(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
           PrintUtils.print(arr);
        }

        return arr;
    }
}
