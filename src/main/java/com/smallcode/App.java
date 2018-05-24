package com.smallcode;

import com.smallcode.algorithm.*;
import com.smallcode.datastructure.MaxHeap;
import com.smallcode.util.PrintUtils;
import com.smallcode.util.SampleDataUtil;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Hello world!
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


        Integer[] array = SampleDataUtil.makeArray(20);
        Integer[] arr1 = array.clone();
        heapSort1Test(array);
        heapSort2Test(arr1);

//
//        HashMap<String, String> map = new HashMap<>();
//        map.put("demo", "d");

        // mergeSortTest(array);

       // maxHeapTest();


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

    public static <T extends Comparable<T>> void insertSortTest(T[] array) {
        InsertSort insertSort = new InsertSort();
        long startTime1 = System.currentTimeMillis();
        array = insertSort.sort(array);
        long endTime1 = System.currentTimeMillis();
        float excTime1 = (float) (endTime1 - startTime1) / 1000;
        System.out.println("执行时间：" + excTime1 + "s");
    }

    public static <T extends Comparable<T>> void mergeSortTest(T[] array) {
        //PrintUtils.print(array);
        System.out.println("开始归并排序：");
        MergeSort mergeSort = new MergeSort();
        long startTime1 = System.currentTimeMillis();
        array = mergeSort.sort(array);
        //PrintUtils.print(array);
        long endTime1 = System.currentTimeMillis();
        float excTime1 = (float) (endTime1 - startTime1) / 1000;
        System.out.println("执行时间：" + excTime1 + "s");
    }


    public static void maxHeapTest() {
        MaxHeap<Integer> heap = new MaxHeap<Integer>(10);
        heap.insert(7);
        heap.insert(1);
        heap.insert(10);
        heap.insert(18);
        heap.insert(2);
        heap.insert(8);
        heap.insert(19);
        heap.insert(4);
        heap.insert(20);
        heap.insert(30);

        while (!heap.isEmpty()) {
            System.out.println(heap.extractMax());
        }

        System.out.println(heap.toString());
    }

    public static <T extends Comparable<T>>  void heapSort1Test(T[] array) {
        HeapSort heapSort = new HeapSort();

        long startTime = System.currentTimeMillis();
        array = heapSort.sort1(array);
        long endTime = System.currentTimeMillis();
        float excTime = (float) (endTime - startTime) / 1000;
        System.out.println("heap sort 1 执行时间：" + excTime + "s");
    }


    public static <T extends Comparable<T>>  void heapSort2Test(T[] array) {
        HeapSort heapSort = new HeapSort();
        PrintUtils.print(array);
        long startTime = System.currentTimeMillis();
        array = heapSort.sort2(array);
        long endTime = System.currentTimeMillis();
        float excTime = (float) (endTime - startTime) / 1000;
        PrintUtils.print(array);
        System.out.println("heap sort 2 执行时间：" + excTime + "s");
    }

}
