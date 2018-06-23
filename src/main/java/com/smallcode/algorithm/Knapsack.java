package com.smallcode.algorithm;

/**
 * 背包问题
 * 有n个物品，有质量w和价值v，有个固定容量的背包，怎么选择物品使得背包背的物品价值最大
 * B(k,w)  k:前几个物品 w剩余背包质量
 * B(k-1,w)  w(k)>w
 * B(k-1,w)  w(k)<=w 不选k
 * B(k-1,w-w(k))+v(k) w(k)<=w 选择k
 *
 * @author niele
 * @date 2018/6/24
 */
public class Knapsack {

    private static int N = 6;
    private static int W = 21;

    public int B[][] = new int[N][W];

    int[] w = {0, 2, 3, 4, 5, 9};
    int[] v = {0, 3, 4, 5, 8, 10};

    public void knapsack() {
        int k, c;
        for (k = 1; k < N; k++) {
            for (c = 1; c < W; c++) {
                if (w[k] > c) {
                    B[k][c] = B[k - 1][c];
                } else {
                    int value1 = B[k - 1][c - w[k]] + v[k];
                    int value2 = B[k - 1][c];
                    if (value1 > value2) {
                        B[k][c] = value1;
                    } else {
                        B[k][c] = value2;
                    }
                }
            }
        }
    }
}
