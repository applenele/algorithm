package com.smallcode;

import com.smallcode.algorithm.BubbleSort;
import com.smallcode.algorithm.SelectionSort;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 6, 3, 10, 28, 7, 8};
        //SelectionSort selectionSort = new SelectionSort();
        //arr = selectionSort.sort(arr);

        BubbleSort bubbleSort = new BubbleSort();
        arr = bubbleSort.sort(arr);
        for (int val : arr) {
            System.out.println(val);
        }
    }
}
