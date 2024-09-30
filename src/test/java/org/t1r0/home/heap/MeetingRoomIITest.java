package org.t1r0.home.heap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MeetingRoomIITest {

    private static final MeetingRoomII subject = new MeetingRoomII();

    @Test
    void requirements_1() {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        int ans = subject.minMeetingRooms(intervals);
        assertThat(ans).isEqualTo(2);
    }

    @Test
    void requirements_2() {
        int[][] intervals = {{7, 10}, {2, 4}};
        int ans = subject.minMeetingRooms(intervals);
        assertThat(ans).isEqualTo(1);
    }
}
