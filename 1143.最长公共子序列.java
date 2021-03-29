/*
 * @lc app=leetcode.cn id=1143 lang=java
 *
 * [1143] 最长公共子序列
 */

// @lc code=start
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 0; i < len1; i++) {
            for (int k = 0; k < len2; k++) {
                char c1 = text1.charAt(i);
                char c2 = text2.charAt(k);
                if (c1 == c2) {
                    dp[i + 1][k + 1] = dp[i][k] + 1;
                } else {
                    dp[i + 1][k + 1] = Math.max(dp[i][k + 1], dp[i + 1][k]);
                }
            }
        }

        return dp[len1][len2];
    }
}
// @lc code=end

