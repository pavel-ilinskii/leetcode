package org.t1r0.home.heap;

import java.util.PriorityQueue;

/**
 * You have some number of sticks with positive integer lengths.
 * These lengths are given as an array sticks, where sticks[i] is the length of the ith stick.
 * <p>
 * You can connect any two sticks of lengths x and y into one stick by paying a cost of x + y.
 * You must connect all the sticks until there is only one stick remaining.
 * <p>
 * Return the minimum cost of connecting all the given sticks into one stick in this way.
 */
public class MinimumCostConnectSticks {

    public int connectSticks(int[] sticks) {
        var pq = new PriorityQueue<Integer>();
        for (var stick : sticks) pq.add(stick);
        int total = 0;
        while (pq.size() > 1) {
            int cost = pq.poll() + pq.poll();
            pq.add(cost);
            total += cost;
        }
        return total;
    }
}
