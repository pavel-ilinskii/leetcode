package org.t1r0.home.heap;

public class MeetingRoomII {

    public int minMeetingRooms(int[][] intervals) {
        int[] line = new int[1_000_001];
        int max = -1;
        int min = 1_000_002;
        for (var interval : intervals) {
            for (int j = interval[0]; j < interval[1]; j++) {
                line[j]++;
            }
            if (min > interval[0]) min = interval[0];
            if (max < interval[1]) max = interval[1];
        }
        int ans = 0;
        for (int i = min; i <= max; i++) {
            if (line[i] > ans) ans = line[i];
        }
        return ans;
    }
}
