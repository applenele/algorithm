package com.smallcode.algorithm;

import com.smallcode.util.PrintUtils;

/**
 * @author niele
 * @date 2018/5/9
 * 快速排序，分区递归排序，二分思想
 * http://developer.51cto.com/art/201403/430986.htm
 */
public class QuickSort {


    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int left1 = left;
        int right1 = right;
        int temp = arr[left];

        while (left1 < right1) {
            while (arr[right1] >= temp && left1 < right1) {
                right1--;
            }
            while (arr[left1] <= temp && left1 < right1) {
                left1++;
            }

            if (left1 < right1) {
                int temp1 = arr[left1];
                arr[left1] = arr[right1];
                arr[right1] = temp1;
            }
        }

        arr[left] = arr[left1];
        arr[left1] = temp;

        quickSort(arr, left + 1, left1 - 1);
        quickSort(arr, right1 + 1, right);
    }
}

