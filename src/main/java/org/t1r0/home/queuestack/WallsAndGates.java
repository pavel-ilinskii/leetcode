package org.t1r0.home.queuestack;

public class WallsAndGates {

    public void wallsAndGates(int[][] rooms) {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (rooms[i][j] == 0) {
                    processRoom(rooms, i, j, 0);
                }
            }
        }
    }

    private void processRoom(int[][] rooms, int i, int j, int mark) {
        rooms[i][j] = mark;
        // UP
        if (i > 0) {
            int upVal = rooms[i - 1][j];
            if (upVal > mark + 1 && upVal != -1) processRoom(rooms, i - 1, j, mark + 1);
        }
        // DOWN
        if (i < rooms.length - 1) {
            int downVal = rooms[i + 1][j];
            if (downVal > mark + 1 && downVal != -1) processRoom(rooms, i + 1, j, mark + 1);
        }
        // LEFT
        if (j > 0) {
            int leftVal = rooms[i][j - 1];
            if (leftVal > mark + 1 && leftVal != -1) processRoom(rooms, i, j - 1, mark + 1);
        }
        // RIGHT
        if (j < rooms[i].length - 1) {
            int rightVal = rooms[i][j + 1];
            if (rightVal > mark + 1 && rightVal != -1) processRoom(rooms, i, j + 1, mark + 1);
        }
    }
}
