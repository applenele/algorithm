package com.smallcode.util;

/**
 * @author niele
 * @date 2018/5/13
 */
public class SortUtils {

    /**
     * Helper method for swapping places in array
     *
     * @param array The array which elements we want to swap
     * @param idx   index of the first element
     * @param idy   index of the second element
     */
    public static <T> boolean swap(T[] array, int idx, int idy) {
        T swap = array[idx];
        array[idx] = array[idy];
        array[idy] = swap;
        return true;
    }


    /**
     * This method checks if first element is less then the other element
     *
     * @param v first element
     * @param w second element
     * @return true if the first element is less then the second element
     */
    public static <T extends Comparable<T>> boolean less(T v, T w) {
        return v.compareTo(w) < 0;
    }
}
