/*
 * @lc app=leetcode.cn id=300 lang=java
 *
 * [300] 最长递增子序列
 */

// @lc code=start
class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length < 2) return nums.length;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int k = 0; k < i; k++) {
                if (nums[k] < nums[i]) dp[i] = Math.max(dp[i], dp[k] + 1);
            }
            res = Math.max(res, dp[i]);
        }

        return res;
    }
}
// @lc code=end

