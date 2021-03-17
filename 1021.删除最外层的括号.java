/*
 * @lc app=leetcode.cn id=1021 lang=java
 *
 * [1021] 删除最外层的括号
 */

// @lc code=start
class Solution {
    public String removeOuterParentheses(String S) {
        int open = 0;
        StringBuilder sb = new StringBuilder();
        for (char c: S.toCharArray()) {
            if (c == '(' && open++ > 0) sb.append(c);
            if (c == ')' && open-- > 1) sb.append(c);
        }

        return sb.toString();
    }
}
// @lc code=end

