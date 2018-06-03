package com.smallcode.datastructure.graph;

/**
 * 邻接矩阵 用于表示稠密图
 *
 * @author niele
 * @date 2018/6/3
 */
public class AdjacencyMatrix {

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

    /**
     * 二维数组表示矩阵
     */
    private boolean[][] g;

    public AdjacencyMatrix(int v, boolean directed) {
        this.vertex = v;
        this.directed = directed;
        g = new boolean[v][v];
    }

    /**
     * 增加边
     *
     * @param v1 顶点
     * @param v2 顶点
     */
    public void addEdge(int v1, int v2) {
        if (v1 < 0 || v1 >= vertex) {
            throw new RuntimeException();
        }
        if (v2 < 0 || v2 >= vertex) {
            throw new RuntimeException();
        }

        if (hasEdge(v1, v2)) {
            return;
        }

        g[v1][v2] = true;
        if (!directed) {
            // 如果不是有向图，将逆向的也表示成连接
            g[v2][v1] = true;
        }

        edge++;
    }

    public boolean hasEdge(int v1, int v2) {
        assert v1 > 0 && v1 < vertex;
        assert v2 > 0 && v2 < vertex;
        return g[v1][v2];
    }

    public int v() {
        return vertex;
    }

    public int e() {
        return edge;
    }


}
