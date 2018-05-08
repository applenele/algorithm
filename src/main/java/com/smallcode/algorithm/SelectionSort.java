package com.smallcode.algorithm;


/**
 * @author lenny
 * 选择排序
 * 从第一个元素开始遍历，找到最小的元素的下表，然后将最好的元素交换到最前面
 * 后面的一次类推
 * 时间复杂度（O(n^2)）空间复杂度(O(1))
 */
public class SelectionSort {
    public int[] sort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            int k = i;
            for (int j = k + 1; j < size; j++) {
                if (arr[j] < arr[k]) {
                    k = j;
                }
            }
            if (k != i) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
        return arr;
    }
}
