/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int left = 0;
        int right = len - 1;
        int max = 0;
        int mul;
        while (left < right) {
            if (height[left] < height[right]) {
                mul = height[left] * (right - left);
                max = mul > max ? mul : max;
                left++;
                while (left < right && height[left] <= height[left - 1]) left++;
            } else {
                mul = height[right] * (right - left);
                max = mul > max ? mul : max;
                right--;
                while (left < right && height[right] <= height[right + 1]) right--;
            }
        }

        return max;
    }
}
// @lc code=end

