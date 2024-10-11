package org.t1r0.home.binarysearch;

public class GuessGame {

    public int guessNumber(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int guess = guess(mid);
            if (guess == 0) {
                return mid;
            } else if (guess > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    int guess(int num) {
        return 0;
    }
}
