/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // 1. brute force
        // 2. sort, two pointer find
        // check edge
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums == null || nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);
        int len = nums.length;

        for (int i = 0; i < len - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int from = i + 1;
            int to = len - 1;
            int target = -nums[i];
            while (from < to) {
                if (target == nums[from] + nums[to]) {
                    result.add(Arrays.asList(nums[i], nums[from], nums[to]));
                    from++;
                    to--;
                    // remove same result
                    while (from < to && nums[from] == nums[from - 1]) from++;
                    while (from < to && nums[to] == nums[to + 1]) to--;
                } else if (target > nums[from] + nums[to]) {
                    from++;
                } else {
                    to--;
                }
            }
        }

        return result;
    }
}
// @lc code=end

