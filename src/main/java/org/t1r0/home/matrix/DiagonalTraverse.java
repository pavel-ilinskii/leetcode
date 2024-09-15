package org.t1r0.home.matrix;

/**
 * Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.
 */
public class DiagonalTraverse {

    public int[] findDiagonalOrder(int[][] mat) {
        int i = 0, j = 0;
        boolean up = true;

        int N = mat.length;
        int M = mat[0].length;

        int[] ans = new int[N * M];
        int curr = 0;

        while (!(i == N - 1 && j == M - 1)) {
            ans[curr++] = mat[i][j];

            if (up) {
                if (j == M - 1) {
                    i++;
                    up = false;
                } else if (i == 0) {
                    j++;
                    up = false;
                } else {
                    i--;
                    j++;
                }
            } else {
                if (i == N - 1) {
                    j++;
                    up = true;
                } else if (j == 0) {
                    i++;
                    up = true;
                } else {
                    i++;
                    j--;
                }
            }
        }

        ans[ans.length - 1] = mat[N - 1][M - 1];

        return ans;
    }
}
