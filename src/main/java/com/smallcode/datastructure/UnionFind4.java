package com.smallcode.datastructure;

/**
 * @author niele
 * @date 2018/5/30
 */
public class UnionFind4 {

    private int[] parent;

    private int count;

    private int[] rank;

    public UnionFind4(int n) {
        parent = new int[n];
        count = n;
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 1;
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
     * 将子节高度低的合并到高度高的上面
     *
     * @param p
     * @param q
     */
    public void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot) {
            return;
        }
        if (rank[pRoot] < rank[qRoot]) {
            parent[pRoot] = qRoot;
        } else if (rank[pRoot] > rank[qRoot]) {
            parent[qRoot] = pRoot;
        } else {
            parent[pRoot] = qRoot;
            rank[qRoot] += 1;
        }
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(parent[i] + ",");
        }
        System.out.println();
    }
}
