package com.smallcode;

import com.smallcode.algorithm.BubbleSort;
import com.smallcode.algorithm.InsertSort;
import com.smallcode.algorithm.SelectionSort;
import com.smallcode.util.PrintUtils;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 6, 3, 10, 28, 7, 8};
        //SelectionSort selectionSort = new SelectionSort();
        //arr = selectionSort.sort(arr);

//        BubbleSort bubbleSort = new BubbleSort();
//        arr = bubbleSort.sort(arr);

        InsertSort insertSort = new InsertSort();
        insertSort.sort(arr);

        PrintUtils.print(arr);
    }
}
