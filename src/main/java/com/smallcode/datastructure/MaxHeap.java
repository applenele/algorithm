package com.smallcode.datastructure;

import java.util.Arrays;

/**
 * @author niele
 * @date 2018/5/23
 * 定义一个大顶堆
 * 父亲节点的值要大于子节点
 */
public class MaxHeap {


    private int[] data;

    private int count;

    private int capacity;


    public MaxHeap(int capacity) {
        // data数组从零开始
        data = new int[capacity + 1];
        this.capacity = capacity;
        this.count = 0;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void insert(int val) {
        if (count + 1 > capacity) {
            throw new RuntimeException("超过堆的容量");
        }
        data[count + 1] = val;
        count++;
        shiftUp(count);
    }

    /**
     * 将新增的值放到合适的位置，因为添加的时候是最底层，如果值大于上层的值，要将值往上切换
     */
    private void shiftUp(int index) {
        int k = index;
        while (k > 1 && data[k] > data[k / 2]) {
            int temp = data[k];
            data[k] = data[k / 2];
            data[k / 2] = temp;
            k = k / 2;
        }
    }

    @Override
    public String toString() {
        return "MaxHeap{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
