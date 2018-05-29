package com.smallcode.datastructure;

/**
 * 并查集
 * 通过数组来简单的实现一个最简单的并查集的数据结构
 *
 * @author niele
 * @date 2018/5/29
 */
public class UnionFind {

    private int[] ids;

    private int count;

    /**
     * 构造函数初始化将数组的值初始化为下标的值
     *
     * @param n
     */
    public UnionFind(int n) {
        ids = new int[n];
        count = n;
        for (int i = 0; i < n; i++) {
            ids[i] = i;
        }
    }

    /**
     * 根据下标来查找
     *
     * @param p
     * @return
     */
    public int find(int p) {
        if (p >= 0 && p < count) {
            return ids[p];
        }
        throw new RuntimeException("数组下表越界");
    }

    /**
     * 判断两个元素是不是连通的
     *
     * @param p
     * @param q
     * @return
     */
    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    /**
     * 两个元素做集合操作
     * 存在性能问题，做union的时候需要遍历数组
     * @param p
     * @param q
     */
    public void union(int p, int q) {
        int pId = find(p);
        int qId = find(q);
        if (pId == qId) {
            return;
        }
        for (int i = 0; i < count; i++) {
            if (ids[i] == qId) {
                ids[i] = pId;
            }
        }
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(ids[i] + ",");
        }
        System.out.println();
    }

}
