package org.t1r0.home.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k,
 * return the k closest points to the origin (0, 0).
 * <p>
 * The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2)2 + (y1 - y2)2).
 * <p>
 * You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).
 */
public class KClosestPointsOrigin {

    public int[][] kClosest(int[][] points, int k) {
        var minHeap = new PriorityQueue<int[]>(Comparator.comparingInt(point -> point[0] * point[0] + point[1] * point[1]));
        for (var point : points) {
            minHeap.add(point);
        }
        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }
        return result;
    }
}
