/*
 * @lc app=leetcode.cn id=874 lang=java
 *
 * [874] 模拟行走机器人
 */

// @lc code=start
class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int x = 0, y = 0, di = 0;
        int addNo = 30000;
        int multiNo = 16;

        // Encode obstacles (x, y) as (x + 30000) * (2^16) + (y + 30000)
        Set<Long> obstacleSet = new HashSet();
        for (int[] obstacle: obstacles) {
            long ox = (long)obstacle[0] + addNo;
            long oy = (long)obstacle[1] + addNo;
            obstacleSet.add((ox << multiNo) + oy);
        }

        int ans = 0;
        for (int cmd: commands) {
            if (cmd == -2) // left
                di = (di + 3) % 4;
            else if (cmd == -1) // right
                di = (di + 1) % 4;
            else {
                for (int k = 0; k < cmd; ++k) {
                    int nx = x + dx[di];
                    int ny = y + dy[di];
                    long code = (((long) nx + addNo) << multiNo) + ((long)ny + addNo);
                    if (!obstacleSet.contains(code)) {
                        x = nx;
                        y = ny;
                        ans = Math.max(ans, x * x + y * y);
                    }
                }
            }
        }

        return ans;
    }
}
// @lc code=end

