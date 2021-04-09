/*
 * @lc app=leetcode.cn id=680 lang=java
 *
 * [680] 验证回文字符串 Ⅱ
 */

// @lc code=start
class Solution {
    public boolean validPalindrome(String s) {
        if (s.length() <= 2) return true;
        int l = 0, r = s.length() - 1;
        char[] chars = s.toCharArray();
        while (l < r) {
            if (chars[l] == chars[r]) {
                l++;
                r--;
            } else {
                return helper(chars, l + 1, r) || helper(chars, l, r - 1);
            }
        }
        return true;
    }

    private boolean helper(char[] chars, int l, int r) {
        while (l < r) {
            if (chars[l] == chars[r]) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

