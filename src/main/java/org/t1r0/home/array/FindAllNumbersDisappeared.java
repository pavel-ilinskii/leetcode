package org.t1r0.home.array;

import java.util.LinkedList;
import java.util.List;

public class FindAllNumbersDisappeared {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> ans = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            int pos = Math.abs(nums[i]) - 1;
            if (nums[pos] > 0) {
                nums[pos] = -nums[pos];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans.add(i + 1);
            }
        }

        return ans;
    }
}
