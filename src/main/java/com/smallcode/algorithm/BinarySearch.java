package com.smallcode.algorithm;

/**
 * @author niele
 * @date 2018/5/25
 */
public class BinarySearch {


    /**
     * 二分查找，
     * 前提是顺序的数组
     * 依次缩短查找的空间
     * @param array
     * @param t
     * @param <T>
     * @return
     */
    public <T extends Comparable<T>> int search(T[] array, T t) {
        int length = array.length;

        int left = 0;
        int right = length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == t) {
                return mid;
            }

            if (array[mid].compareTo(t) > 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return -1;
    }
}
