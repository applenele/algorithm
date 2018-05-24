package com.smallcode.datastructure;

import java.util.Arrays;

/**
 * @author niele
 * @date 2018/5/23
 * 定义一个大顶堆
 * 父亲节点的值要大于子节点
 * 根节点从1开始标注
 * 公式  left = i * 2 , right = i * 2 +1
 * 从低开始第一个非叶子节点 i = count / 2;
 */
public class MaxHeap<T extends Comparable<T>> {


    private T[] data;

    private int count;

    private int capacity;


    public MaxHeap(int capacity) {
        // data数组从零开始
        data = (T[]) new Comparable[capacity + 1];
        this.capacity = capacity;
        this.count = 0;
    }

    /**
     * Heapify
     * 构建堆的效率高
     * 原理：二分shiftDown 比全部的ShiftUp效率高
     * @param arr
     */
    public MaxHeap(T[] arr) {
        int length = arr.length;
        data = (T[]) new Comparable[length + 1];
        capacity = length;
        count = length;

        for (int i = 0; i < length; i++) {
            data[i + 1] = arr[i];
        }

        for (int i = count / 2; i >= 1; i--) {
            shiftDown(i);
        }
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void insert(T val) {
        if (count + 1 > capacity) {
            throw new RuntimeException("超过堆的容量");
        }
        data[count + 1] = val;
        count++;
        shiftUp(count);
    }

    /**
     * 将新增的值放到合适的位置，因为添加的时候是最底层
     * 如果值大于上层的值，要将值往上切换
     */
    private void shiftUp(int k) {
        while (k > 1 && data[k].compareTo(data[k / 2]) > 0) {
            swap(k / 2, k);
            k = k / 2;
        }
    }

    /**
     * 获取最大值，将根节点拿出来
     * 再将最后一个元素放到根节点
     * 在对此时的根节点执行shiftDown操作
     * 将根节点下沉到合适的位置
     *
     * @return
     */
    public T extractMax() {
        T ret = data[1];

        data[1] = null;

        swap(1, count);

        count--;

        shiftDown(1);

        return ret;
    }

    private void shiftDown(int k) {
        while (k * 2 <= count) {
            int j = k * 2;
            if (j + 1 <= count && data[j + 1].compareTo(data[j]) > 0) {
                j = j + 1;
            }

            if (data[k].compareTo(data[j]) > 0) {
                break;
            }

            swap(k, j);

            k = j;
        }
    }

    @Override
    public String toString() {
        return "MaxHeap{" +
                "data=" + Arrays.toString(data) +
                '}';
    }

    public void swap(int k, int j) {
        T temp = data[k];
        data[k] = data[j];
        data[j] = temp;
    }
}
