package com.smallcode.datastructure.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * 邻接表
 * 稀疏图
 *
 * @author niele
 * @date 2018/6/3
 */
public class AdjacencyList {

    /**
     * 顶点
     */
    private int vertex;

    /**
     * 边
     */
    private int edge;

    /**
     * 是否有向图
     */
    private boolean directed;


    private List<Integer>[] g;

    public AdjacencyList(int v, boolean directed) {
        this.vertex = v;
        this.directed = directed;

        g = (ArrayList<Integer>[]) new ArrayList[v];

        for (int i = 0; i < v; i++) {
            g[i] = new ArrayList<>();
        }
    }

    public int v() {
        return vertex;
    }

    public int e() {
        return edge;
    }

    /**
     * 增加边
     *
     * @param v1
     * @param v2
     */
    public void addEdge(int v1, int v2) {
        assert v1 > 0 && v1 < vertex;
        assert v2 > 0 && v2 < vertex;

        // 此处并没有检查平行边，这个地方的检查需要调用hasEdge，效率可能低
        g[v1].add(v2);
        if (v1 != v2 && !directed) {
            // 定点不相同，并且无向图，增加首相
            g[v2].add(v1);
        }

        edge++;
    }


    /**
     * 是不是存在边
     *
     * @param v1
     * @param v2
     * @return
     */
    public boolean hasEdge(int v1, int v2) {
        assert v1 > 0 && v1 < vertex;
        assert v2 > 0 && v2 < vertex;
        return g[v1].contains(v2);
    }

    /**
     * 返回给定顶点的连接顶点
     *
     * @param v
     * @return
     */
    public List<Integer> adj(int v) {
        assert v > 0 && v < vertex;
        return g[v];
    }
}
