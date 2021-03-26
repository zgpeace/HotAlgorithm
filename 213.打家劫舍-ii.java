/*
 * @lc app=leetcode.cn id=213 lang=java
 *
 * [213] 打家劫舍 II
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        return Math.max(myRob(Arrays.copyOfRange(nums, 0, nums.length - 1)), myRob(Arrays.copyOfRange(nums, 1, nums.length)));
    }

    public int myRob(int[] nums) {
        int pre = 0, current = 0, temp;
        for (int n: nums) {
            temp = current;
            current = Math.max(pre + n, current);
            pre = temp;
        }

        return current;
    }
}
// @lc code=end

