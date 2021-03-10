/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int pre = 1;
        int current = 2;
        int next;
        for(int i = 3; i <= n; i++) {
            next = current + pre;
            pre = current;
            current = next;
        }

        return current;
    }
}
// @lc code=end

