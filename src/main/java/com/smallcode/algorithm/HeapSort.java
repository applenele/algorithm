package com.smallcode.algorithm;

import com.smallcode.datastructure.MaxHeap;

/**
 * @author niele
 * @date 2018/5/24
 */
public class HeapSort {


    /**
     * 最大堆排序
     * 先构建最大堆，
     * 在依次取出最大值
     *
     * @param arr
     * @return
     */
    public <T extends Comparable<T>> T[] sort1(T[] arr) {
        int length = arr.length;
        MaxHeap<T> heap = new MaxHeap<T>(length);
        for (int i = 0; i < length; i++) {
            heap.insert(arr[i]);
        }
        for (int i = length - 1; i >= 0; i--) {
            arr[i] = heap.extractMax();
        }
        return arr;
    }


    public <T extends Comparable<T>> T[] sort2(T[] arr) {
        int length = arr.length;
        MaxHeap<T> heap = new MaxHeap<>(arr);

        for (int i = length - 1; i >= 0; i--) {
            arr[i] = heap.extractMax();
        }
        return arr;
    }
}
