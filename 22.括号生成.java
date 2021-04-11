/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        helper(0, 0, n, "", list);

        return list;
    }

    private void helper(int l, int r, int n, String line, List<String> list) {
        // terminal
        if (l == n && r == n) {
            list.add(line);
            return;
        }
        // drill down
        if (l < n) helper(l + 1, r, n, line + "(", list);
        if (l > r) helper(l, r + 1, n, line + ")", list);
        // reverse status
    }
}
// @lc code=end

