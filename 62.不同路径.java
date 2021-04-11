/*
 * @lc app=leetcode.cn id=62 lang=java
 *
 * [62] 不同路径
 */

// @lc code=start
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) dp[i][0] = 1;
        for (int k = 0; k < n; k++) dp[0][k] = 1;
        for (int i = 1; i < m; i++) {
            for (int k = 1; k < n; k++) {
                dp[i][k] = dp[i - 1][k] + dp[i][k - 1];
            }
        }

        return dp[m - 1][n - 1];
    }
}
// @lc code=end

