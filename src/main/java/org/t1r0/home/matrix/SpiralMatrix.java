package org.t1r0.home.matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 */
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = 0;
        int dir = 0;

        int iMin = 0;
        int iMax = matrix.length - 1;
        int jMin = 0;
        int jMax = matrix[0].length - 1;

        for (int c = 0; c < matrix.length * matrix[0].length; c++) {
            ans.add(matrix[i][j]);

            if (dir == 0 && j == jMax) {
                iMin++;
                dir = 1;
            } else if (dir == 1 && i == iMax) {
                jMax--;
                dir = 2;
            } else if (dir == 2 && j == jMin) {
                iMax--;
                dir = 3;
            } else if (dir == 3 && i == iMin) {
                jMin++;
                dir = 0;
            }

            switch (dir) {
                case 0:
                    j++;
                    break;
                case 1:
                    i++;
                    break;
                case 2:
                    j--;
                    break;
                case 3:
                    i--;
                    break;
            }
        }

        return ans;
    }
}
