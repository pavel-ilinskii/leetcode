package org.t1r0.home.binarysearch;

public class FirstBadVersion {

    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) right = mid - 1;
            else left = mid + 1;
        }
        return left;
    }

    boolean isBadVersion(int version) {
        return false;
    }
}
