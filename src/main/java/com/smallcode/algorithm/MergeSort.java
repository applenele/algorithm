package com.smallcode.algorithm;

import java.io.Serializable;

/**
 * @author niele
 * @date 2018/5/14
 */
public class MergeSort {

    public <T extends Comparable<T>> T[] sort(T[] array) {
        T[] temp = (T[]) new Comparable[array.length];
        doSort(array, 0, array.length - 1, temp);
        return array;
    }

    private <T extends Comparable<T>> void doSort(T[] array, int left, int right, T[] temp) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            doSort(array, left, mid, temp);
            doSort(array, mid + 1, right, temp);
            merge(array, left, mid, right, temp);
        }
    }

    private <T extends Comparable<T>> void merge(T[] array, int left, int mid, int right, T[] temp) {
        // 将array拷贝到temp中
        System.arraycopy(array, left, temp, left, right - left + 1);

        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            // 左边的小于右边的，将左边的赋值到数组中
            if (temp[i].compareTo(temp[j]) <= 0) {
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
            k++;
        }

        // 这种情况只有当左边的有大于右边的个数要多，此时左边的已经排好序，将多余的放到右边即可。
        while (i <= mid) {
            array[k] = temp[i];
            k++;
            i++;
        }
    }
}
