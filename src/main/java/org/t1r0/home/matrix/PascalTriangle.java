package org.t1r0.home.matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown
 */
public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<Integer> row = List.of(1);
        var ans = new ArrayList<List<Integer>>();
        ans.add(row);

        for (int i = 1; i < numRows; i++) {
            row = newRow(row);
            ans.add(row);
        }

        return ans;
    }

    private List<Integer> newRow(List<Integer> row) {
        List<Integer> newRow = new ArrayList<>();
        newRow.add(1);
        for (int i = 0; i < row.size() - 1; i++) {
            newRow.add(row.get(i) + row.get(i + 1));
        }
        newRow.add(1);
        return newRow;
    }
}
