package com.smallcode;

import com.smallcode.algorithm.*;
import com.smallcode.datastructure.*;
import com.smallcode.util.PrintUtils;
import com.smallcode.util.RandomUtil;
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


//        Integer[] array = SampleDataUtil.makeArray(10);
//        Integer[] arr1 = array.clone();
//        Integer[] arr2 = array.clone();
//
//        heapSort1Test(array);
//        heapSort2Test(arr1);
//        heapSort3Test(arr2);

//
//        HashMap<String, String> map = new HashMap<>();
//        map.put("demo", "d");

        // mergeSortTest(array);

        // maxHeapTest();

        //mergeSortTest(array);
        //PrintUtils.print(array);
        //binarySearch(array, 5);

//        binarySearchTreeTest();

        int n = 100000;
       // unionFindTest1();
        unionFindTest2(n);
        System.gc();
        unionFindTest3(n);
        System.gc();
        unionFindTest4(n);
        System.gc();
        unionFindTest5(n);
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

    public static <T extends Comparable<T>> void heapSort1Test(T[] array) {
        HeapSort heapSort = new HeapSort();

        long startTime = System.currentTimeMillis();
        array = heapSort.sort1(array);
        long endTime = System.currentTimeMillis();
        float excTime = (float) (endTime - startTime) / 1000;
        System.out.println("heap sort 1 执行时间：" + excTime + "s");
    }


    public static <T extends Comparable<T>> void heapSort2Test(T[] array) {
        HeapSort heapSort = new HeapSort();
        //PrintUtils.print(array);
        long startTime = System.currentTimeMillis();
        array = heapSort.sort2(array);
        long endTime = System.currentTimeMillis();
        float excTime = (float) (endTime - startTime) / 1000;
        //PrintUtils.print(array);
        System.out.println("heap sort 2 执行时间：" + excTime + "s");
    }

    public static <T extends Comparable<T>> void heapSort3Test(T[] array) {
        HeapSort heapSort = new HeapSort();
        //PrintUtils.print(array);
        long startTime = System.currentTimeMillis();
        array = heapSort.sort3(array);
        long endTime = System.currentTimeMillis();
        float excTime = (float) (endTime - startTime) / 1000;
        //PrintUtils.print(array);
        System.out.println("heap sort 3 执行时间：" + excTime + "s");
    }

    public static <T extends Comparable<T>> void binarySearch(T[] array, T t) {
        BinarySearch search = new BinarySearch();
        int index = search.search(array, t);
        System.out.println("查找到的下标：" + index);
    }

    public static void binarySearchTreeTest() {
        BinarySearchTree<Integer, Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insert(8, 2);
        binarySearchTree.insert(2, 3);
        binarySearchTree.insert(10, 5);
        binarySearchTree.insert(3, 10);
        binarySearchTree.insert(4, 1);
        binarySearchTree.insert(12, 1);
        binarySearchTree.insert(5, 1);
        binarySearchTree.insert(6, 1);

//        boolean ret = binarySearchTree.contain(4);
//        System.out.println(ret);

//        Integer ret = binarySearchTree.search(4);
//        System.out.println(ret);

        //binarySearchTree.levelOrder();

//        Integer ret = binarySearchTree.min();
//        System.out.println(ret);
//
//        binarySearchTree.removeMin();
//
//        ret = binarySearchTree.min();
//        System.out.println(ret);
//
//        binarySearchTree.removeMin();
//
//        ret = binarySearchTree.min();
//        System.out.println(ret);

//        Integer ret1 = binarySearchTree.max();
//        System.out.println(ret1);
//
//        binarySearchTree.removeMax();
//
//        ret1 = binarySearchTree.max();
//        System.out.println(ret1);
//
//        binarySearchTree.removeMax();
//
//        ret1 = binarySearchTree.max();
//        System.out.println(ret1);
//
//        binarySearchTree.removeMax();
//
//        ret1 = binarySearchTree.max();
//        System.out.println(ret1);

        binarySearchTree.remove(8);
        binarySearchTree.inOrder();
    }


    public static void unionFindTest1() {

        UnionFind unionFind = new UnionFind(10);

        unionFind.union(1, 2);
        unionFind.union(3, 1);

        System.out.println(unionFind.isConnected(1, 2));

        unionFind.print();
    }


    public static void unionFindTest2(int n) {
        UnionFind unionFind = new UnionFind(n);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int a = RandomUtil.rand(0, n);
            int b = RandomUtil.rand(0, n);
            unionFind.union(a, b);
        }
        for (int i = 0; i < n; i++) {
            int a = RandomUtil.rand(0, n);
            int b = RandomUtil.rand(0, n);
            unionFind.isConnected(a, b);
        }
        long endTime = System.currentTimeMillis();
        float excTime = (float) (endTime - startTime) / 1000;
        System.out.println("执行时间：" + excTime + "s");
    }

    public static void unionFindTest3(int n) {
        UnionFind2 unionFind = new UnionFind2(n);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int a = RandomUtil.rand(0, n);
            int b = RandomUtil.rand(0, n);
            unionFind.union(a, b);
        }
        for (int i = 0; i < n; i++) {
            int a = RandomUtil.rand(0, n);
            int b = RandomUtil.rand(0, n);
            unionFind.isConnected(a, b);
        }
        long endTime = System.currentTimeMillis();
        float excTime = (float) (endTime - startTime) / 1000;
        System.out.println("执行时间：" + excTime + "s");

//        unionFind.print();
    }

    public static void unionFindTest4(int n) {
        UnionFind3 unionFind = new UnionFind3(n);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int a = RandomUtil.rand(0, n);
            int b = RandomUtil.rand(0, n);
            unionFind.union(a, b);
        }
        for (int i = 0; i < n; i++) {
            int a = RandomUtil.rand(0, n);
            int b = RandomUtil.rand(0, n);
            unionFind.isConnected(a, b);
        }
        long endTime = System.currentTimeMillis();
        float excTime = (float) (endTime - startTime) / 1000;
        System.out.println("执行时间：" + excTime + "s");

//        unionFind.print();
    }

    public static void unionFindTest5(int n) {
        UnionFind4 unionFind = new UnionFind4(n);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int a = RandomUtil.rand(0, n);
            int b = RandomUtil.rand(0, n);
            unionFind.union(a, b);
        }
        for (int i = 0; i < n; i++) {
            int a = RandomUtil.rand(0, n);
            int b = RandomUtil.rand(0, n);
            unionFind.isConnected(a, b);
        }
        long endTime = System.currentTimeMillis();
        float excTime = (float) (endTime - startTime) / 1000;
        System.out.println("执行时间：" + excTime + "s");
//        unionFind.print();
    }
}
