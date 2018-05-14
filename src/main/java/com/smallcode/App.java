package com.smallcode;

import com.smallcode.algorithm.*;
import com.smallcode.util.PrintUtils;
import com.smallcode.util.SampleDataUtil;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        //int[] arr = {2, 30, 1, 6, 3, 10, 28, 7, 8, 20, 9, 11, 40, 21, 4};
        //int[] arr = {2, 30, 1, 6, 3, 10, 28, 7, 8, 20, 9, 11, 40, 21, 4};
        //SelectionSort selectionSort = new SelectionSort();
        //arr = selectionSort.sort(arr);

//        BubbleSort bubbleSort = new BubbleSort();
//        arr = bubbleSort.sort(arr);

//        InsertSort insertSort = new InsertSort();
//        insertSort.sort(arr);

//        QuickSort quickSort = new QuickSort();
//        quickSort.sort(arr);


        Integer[] array = SampleDataUtil.makeArray(1000000);
        Integer[] array1 = array.clone();

        //PrintUtils.print(array);
        ShellSort shellSort = new ShellSort();
        long startTime = System.currentTimeMillis();
        array = shellSort.sort(array);
        long endTime = System.currentTimeMillis();
        float excTime = (float) (endTime - startTime) / 1000;
        System.out.println("执行时间：" + excTime + "s");
        //PrintUtils.print(array);

        PrintUtils.printLine();

        System.gc();

        //PrintUtils.print(array1);
        InsertSort insertSort = new InsertSort();
        long startTime1 = System.currentTimeMillis();
        array1 = insertSort.sort(array1);
        long endTime1 = System.currentTimeMillis();
        float excTime1 = (float) (endTime1 - startTime1) / 1000;
        System.out.println("执行时间：" + excTime1 + "s");
        //PrintUtils.print(array1);

    }

    public static <T extends Comparable<T>> void shellSortTest(T[] array) {
        //PrintUtils.print(array);
        ShellSort shellSort = new ShellSort();
        long startTime = System.currentTimeMillis();
        array = shellSort.sort(array);
        long endTime = System.currentTimeMillis();
        float excTime = (float) (endTime - startTime) / 1000;
        System.out.println("执行时间：" + excTime + "s");
        //PrintUtils.print(array);
    }
}
