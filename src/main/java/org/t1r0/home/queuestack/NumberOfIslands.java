package org.t1r0.home.queuestack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
 * <p>
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are all surrounded by water.
 * <p>
 * Input: grid = [
 * ["1","1","1","1","0"],
 * ["1","1","0","1","0"],
 * ["1","1","0","0","0"],
 * ["0","0","0","0","0"]
 * ]
 * Output: 1
 */
public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        int ans = 0;
        int n = grid.length;
        if (n == 0) return 0;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    ans++;
                    q.offer(new int[]{i, j});
                    while (!q.isEmpty()) {
                        int[] cur = q.poll();
                        int ci = cur[0];
                        int cj = cur[1];
                        if (ci < 0 || ci >= n || cj < 0 || cj >= m || grid[ci][cj] == '0') continue;
                        grid[ci][cj] = '0';
                        q.offer(new int[]{ci + 1, cj});
                        q.offer(new int[]{ci - 1, cj});
                        q.offer(new int[]{ci, cj + 1});
                        q.offer(new int[]{ci, cj - 1});
                    }
                }
            }
        }
        return ans;
    }
}
