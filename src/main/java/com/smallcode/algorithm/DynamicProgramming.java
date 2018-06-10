package com.smallcode.algorithm;

/**
 * 动态规划
 * 1.重要的是 找到状态方程，将大的任务拆解程小的任务
 * 2.重叠子问题要重复利用
 *
 * @author niele
 * @date 2018/6/10
 */
public class DynamicProgramming {

    /**
     * 上阶梯问题
     * 递归实现
     * l(n) = l(n-2)+l(n-1)
     *
     * @param n
     * @return
     */
    public int recLadder(int n) {

        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return recLadder(n - 1) + recLadder(n - 2);
        }
    }

    /**
     * 上阶梯问题
     * 重叠子问题先保存起来在使用，提高效率
     *
     * @param n
     * @return
     */
    public int dpLadder(int n) {
        int[] ret = new int[n];
        ret[0] = 1;
        ret[1] = 2;
        for (int i = 2; i < n; i++) {
            ret[i] = ret[i - 1] + ret[i - 2];
        }
        return ret[n - 1];
    }
}
