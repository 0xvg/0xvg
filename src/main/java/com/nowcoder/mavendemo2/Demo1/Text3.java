package com.nowcoder.mavendemo2.Demo1;

public class Text3 {
    //0-1背包问题
    public static int dpWay(int[] w, int[] v, int bag) {
        int N = w.length;
        int[][] dp = new int[N + 1][bag + 1];
        for (int index = N - 1; index >= 0; index--) {
            for (int rest = 1; rest <= bag; rest++) {
                dp[index][rest] = dp[index + 1][rest];
                if (rest >= w[index]) {
                    dp[index][rest] = Math.max(dp[index][rest], v[index] + dp[index + 1][rest - w[index]]);
                }
            }
        }
        return dp[0][bag];
    }
    public static void main(String[] args) {
        int[] weights = { 3, 2, 4, 7 };
        int[] values = { 5, 6, 3, 19 };
        int bag = 11;
        System.out.println(dpWay(weights, values, bag));
    }
}
