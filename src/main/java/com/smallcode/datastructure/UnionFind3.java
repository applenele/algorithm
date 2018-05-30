package com.smallcode.datastructure;

/**
 * @author niele
 * @date 2018/5/30
 */
public class UnionFind3 {

    private int[] parent;

    private int count;

    private int[] sz;

    public UnionFind3(int n) {
        parent = new int[n];
        count = n;
        sz = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            sz[i] = 1;
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
     * 将层级低的合并到层级高的节点上
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
        if (sz[pRoot] < sz[qRoot]) {
            parent[pRoot] = qRoot;
            sz[qRoot] += sz[pRoot];
        } else {
            parent[qRoot] = pRoot;
            sz[pRoot] += sz[qRoot];
        }
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(parent[i] + ",");
        }
        System.out.println();
    }

}
