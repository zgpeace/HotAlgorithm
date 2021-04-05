/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int pre = 0, maxInt = nums[0];
        for (int n: nums) {
            pre = Math.max(pre + n, n);
            maxInt = Math.max(maxInt, pre);
        }

        return maxInt;
    }
}
// @lc code=end

