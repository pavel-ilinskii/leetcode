package org.t1r0.home.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians).
 * The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.
 * <p>
 * A row i is weaker than a row j if one of the following is true:
 * <p>
 * The number of soldiers in row i is less than the number of soldiers in row j.
 * Both rows have the same number of soldiers and i < j.
 * Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.
 */
public class KWeakestRowsInMatrix {

    public int[] kWeakestRows(int[][] mat, int k) {
        var rows = new ArrayList<Row>();

        for (int row = 0; row < mat.length; row++) {
            int col = 0;
            for (; col < mat[row].length && mat[row][col] != 0; col++) ;
            rows.add(new Row(col, row));
        }

        var minHeap = new PriorityQueue<>(Comparator.comparingInt(Row::solders).thenComparingInt(Row::i));

        rows.forEach(minHeap::offer);

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = minHeap.poll().i;
        }
        return res;
    }

    private record Row(int solders, int i) {
    }
}
