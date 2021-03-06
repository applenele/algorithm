package com.smallcode.datastructure;

/**
 * 并查集，通过树的形式
 *  parent[p]=p
 * @author niele
 * @date 2018/5/30
 */
public class UnionFind2 {

    private int[] parent;

    private int count;

    public UnionFind2(int n) {
        parent = new int[n];
        count = n;
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    /**
     * 找到p的根节点
     *
     * @param p
     * @return
     */
    public int find(int p) {
        if (p >= 0 && p < count) {
            while (p != parent[p]) {
                p = parent[p];
            }
            return p;
        }
        throw new RuntimeException();
    }

    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    /**
     * 将其中一个节点的根节点，放到另外一个节点的根节点下面
     * 缺点：合并之后树的高度可能回很高
     * @param p
     * @param q
     */
    public void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot) {
            return;
        }
        parent[pRoot] = qRoot;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(parent[i] + ",");
        }
        System.out.println();
    }
}
