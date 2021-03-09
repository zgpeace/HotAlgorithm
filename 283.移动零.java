/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int head = 0;
        for (int item: nums) {
            if (item != 0) {
                nums[head++] = item;
            }
        }

        while (head < nums.length) {
            nums[head++] = 0;
        }
    }
}
// @lc code=end

