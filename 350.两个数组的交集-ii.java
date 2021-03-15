/*
 * @lc app=leetcode.cn id=350 lang=java
 *
 * [350] 两个数组的交集 II
 */

// @lc code=start
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: nums1) {
            int index = map.getOrDefault(i, 0);
            map.put(i, index + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (int k: nums2) {
            if (map.get(k) != null && map.get(k) > 0) {
                list.add(k);
                map.put(k, map.get(k) - 1);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
// @lc code=end

