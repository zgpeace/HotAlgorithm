/*
 * @lc app=leetcode.cn id=258 lang=java
 *
 * [258] 各位相加
 */

// @lc code=start
class Solution {
    public int addDigits(int num) {
        return (num < 10) ? num : addDigits(num / 10 + num % 10);
    }
}
// @lc code=end

