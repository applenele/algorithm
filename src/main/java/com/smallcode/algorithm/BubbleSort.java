package com.smallcode.algorithm;

import com.smallcode.util.PrintUtils;

/**
 * @author lenny
 *
 * 冒泡排序
 *  从第一个开始，跟第二个开始作比较，将小的交换到第一个位置。
 *  在将第一个元素与第三个位置作比较，将小的元素交换到第一个位置，以此内推。
 *  让后从第二个元素重复上面的步骤
 *  跟选择排序的唯一的不同是，选择排序经过一轮筛选得到最小值在交换到起始位置
 *  在冒泡排序每次都需要交换，直到将最小的数交换到起始位置
 */
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
        }
        return arr;
    }
}
