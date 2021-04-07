/*
 * @lc app=leetcode.cn id=1122 lang=java
 *
 * [1122] 数组的相对排序
 */

// @lc code=start
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        int[] count = new int[1001];
        for (int n: arr1) count[n]++;
        int i = 0;
        for (int k: arr2) {
            while (count[k] > 0) {
                res[i++] = k;
                count[k]--;
            }
        }
        for (int j = 0; j < 1001; j++) {
            while (count[j] > 0) {
                res[i++] = j;
                count[j]--;
            }
        }

        return res;
    }
}
// @lc code=end

