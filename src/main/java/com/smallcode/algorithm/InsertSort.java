package com.smallcode.algorithm;

import com.smallcode.util.PrintUtils;
import com.smallcode.util.SortUtils;

/**
 * @author niele
 * @date 2018/5/8
 * 插入排序
 * 从第二开始，跟第一个比较，如果第二个小于第二个，将第二个插到第一个前面，就是将第二个跟第一个交换位置
 * 然后从第三个开始，先跟第二个比较，如果第三个小于第二个，将第三个跟第二个交换位置，如果第二个比第一个小，将第二个跟第一个交换位置
 * 依次类推
 */
public class InsertSort {
    
    public <T extends Comparable<T>> T[] sort(T[] arr) {
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if(SortUtils.less(arr[j],arr[j-1])){
                    SortUtils.swap(arr,j-1,j);
                }
            }
        }
        return arr;
    }
}
