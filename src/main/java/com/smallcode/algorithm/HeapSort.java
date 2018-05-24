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


    /**
     * 构建堆的时候采用了Heapify，提高了创建堆的效率
     *
     * @param arr
     * @param <T>
     * @return
     */
    public <T extends Comparable<T>> T[] sort2(T[] arr) {
        int length = arr.length;
        MaxHeap<T> heap = new MaxHeap<>(arr);

        for (int i = length - 1; i >= 0; i--) {
            arr[i] = heap.extractMax();
        }
        return arr;
    }

    /**
     * 先将传入的数组heapify，在将最大的交换到最后，再将之前的数组shiftDown
     * @param arr
     * @param <T>
     * @return
     */
    public <T extends Comparable<T>> T[] sort3(T[] arr) {
        int length = arr.length;

        for (int i = (length - 1) / 2; i >= 0; i--) {
            shiftDown(arr, length, i);
        }

        for (int i = length - 1; i > 0; i--) {
            swap(arr, 0, i);
            shiftDown(arr, i, 0);
        }

        return arr;
    }

    private <T extends Comparable<T>> void shiftDown(T[] arr, int length, int k) {

        while (2 * k + 1 < length) {
            int j = 2 * k + 1;
            if (j + 1 < length && arr[j + 1].compareTo(arr[j]) > 0) {
                j = j + 1;
            }

            if (arr[k].compareTo(arr[j]) >= 0) {
                break;
            }

            swap(arr, k, j);

            k = j;
        }
    }

    public <T extends Comparable<T>> void swap(T[] arr, int k, int j) {
        T temp = arr[k];
        arr[k] = arr[j];
        arr[j] = temp;
    }

}
