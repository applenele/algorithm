package com.smallcode.algorithm;

import com.smallcode.util.PrintUtils;
import com.smallcode.util.SortUtils;

/**
 * 希尔排序
 *
 * @author niele
 * @date 2018/5/13
 * 希尔排序是对插入排序的优化
 * https://www.jianshu.com/p/d730ae586cf3
 * 大致思路：先将数组选择的一个起始的分组，先将组间之前的元素排序。
 * 减少组中元素的元素即增加了组数，再将组中元素排序。知道组中元素只剩一个人元素，此时组数为数组的长度
 * 此时做的相当于一个全组的插入排序，但是此时的数组大致顺序已经有了。
 * 平均的时间复杂度O(nlogn)
 */
public class ShellSort {


    public <T extends Comparable<T>> T[] sort(T[] array) {

        int length = array.length;
        int gap = (int) Math.floor(length / 2);

        while (gap > 0) {
            for (int i = gap; i < length; i++) {
                for (int j = i; j >= gap; j -= gap) {
                    if (SortUtils.less(array[j],array[j - gap])) {
                        SortUtils.swap(array, j - gap, j);
                    }
                }
            }
            gap = (int) Math.floor(gap / 2);
        }
        return array;
    }
}
