package org.t1r0.home.matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
 * Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?
 */
public class PascalTriangleII {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);

        for (int k = 1; k <= rowIndex; k++) {
            ans.add((int) ((ans.get(ans.size() - 1) * (long) (rowIndex - k + 1)) / k));
        }

        return ans;
    }
}
