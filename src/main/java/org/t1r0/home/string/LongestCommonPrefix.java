package org.t1r0.home.string;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        int pos = -1;

        while (strEquals(strs, pos + 1)) {
            pos++;
        }

        return pos == -1 ? "" : strs[0].substring(0, pos + 1);
    }

    private boolean strEquals(String[] strs, int i) {
        if (strs[0].length() <= i) {
            return false;
        }
        char c = strs[0].charAt(i);
        for (int j = 1; j < strs.length; j++) {
            if (strs[j].length() <= i || strs[j].charAt(i) != c) return false;
        }
        return true;
    }
}
