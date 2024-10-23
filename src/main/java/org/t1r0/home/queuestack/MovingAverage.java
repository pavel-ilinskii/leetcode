package org.t1r0.home.queuestack;

import java.util.LinkedList;

public class MovingAverage {

    LinkedList<Integer> q;
    int size;

    public MovingAverage(int size) {
        q = new LinkedList<>();
        this.size = size;
    }

    public double next(int val) {
        q.offer(val);
        if (q.size() > size) q.poll();
        return q.stream().mapToInt(i -> i).average().getAsDouble();
    }
}
