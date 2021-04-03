/*
 * @lc app=leetcode.cn id=199 lang=java
 *
 * [199] 二叉树的右视图
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> allList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        dfs(root, 0, allList);

        for (int i = 0; i < allList.size(); i++) {
            list.add(allList.get(i).get(allList.get(i).size() - 1));
        }

        return list;
    }

    private void dfs(TreeNode root, int level, List<List<Integer>> allList) {
        if (root == null) return;
        if (level == allList.size()) allList.add(new ArrayList<Integer>());
        allList.get(level).add(root.val);
        dfs(root.left, level + 1, allList);
        dfs(root.right, level + 1, allList);
    }
}
// @lc code=end

