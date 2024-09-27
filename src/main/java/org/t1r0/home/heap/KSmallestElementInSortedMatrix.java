package org.t1r0.home.heap;

import java.util.PriorityQueue;

/**
 * Given an n x n matrix where each of the rows and columns is sorted in ascending order, return the kth smallest element in the matrix.
 * <p>
 * Note that it is the kth smallest element in the sorted order, not the kth distinct element.
 * <p>
 * You must find a solution with a memory complexity better than O(n2).
 */
public class KSmallestElementInSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        int r = Math.min(matrix.length, k);
        PriorityQueue<HeapNode> minHeap = new PriorityQueue<HeapNode>();
        for (int i = 0; i < r; i++) {
            minHeap.add(new HeapNode(i, 0, matrix[i][0]));
        }

        HeapNode min = minHeap.peek();
        for (int i = 0; i < k; i++) {
            min = minHeap.poll();
            if (min.col + 1 < r) {
                minHeap.add(new HeapNode(min.row, min.col + 1, matrix[min.row][min.col + 1]));
            }
        }

        return min.val;
    }

    private record HeapNode(int row, int col, int val) implements Comparable<HeapNode> {

        @Override
        public int compareTo(HeapNode o) {
            return val - o.val;
        }
    }
}
