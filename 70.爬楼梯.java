/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) return 1;
        int pre = 1;
        int current = 1;
        int next;
        for(int i = 2; i <= n; i++) {
            next = current + pre;
            pre = current;
            current = next;
        }

        return current;
    }
}
// @lc code=end

