package org.t1r0.home.array;

public class ThirdMaximumNumber {

    private static final int MAX_DISTINCT_NUM = 3;

    public int thirdMax(int[] nums) {
        Integer[] arr = new Integer[MAX_DISTINCT_NUM];

        for (int num : nums) {
            insert(arr, num);
        }

        if (arr[0] == null) {
            return arr[MAX_DISTINCT_NUM - 1];
        }

        return arr[0];
    }

    private void insert(Integer[] arr, int num) {
        for (int i = MAX_DISTINCT_NUM - 1; i >= 0; i--) {
            if (arr[i] != null && arr[i] == num) break;
            if (arr[i] == null || arr[i] < num) {
                for (int j = 0; j < i; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[i] = num;
                break;
            }
        }
    }
}
