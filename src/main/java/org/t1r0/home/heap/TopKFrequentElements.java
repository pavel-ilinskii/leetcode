package org.t1r0.home.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Given an integer array nums and an integer k, return the k most frequent elements.
 * You may return the answer in any order.
 */
public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int n : nums) {
            if (n < min) min = n;
            if (n > max) max = n;
        }

        int[] freq = new int[max - min + 1];

        for (int n : nums) {
            freq[n - min]++;
        }

        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(Comparator.comparing(Pair::value).reversed());

        for (int f = 0; f < freq.length; f++) {
            if (freq[f] != 0) maxHeap.add(new Pair(f, freq[f]));
        }

        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            res[i] = maxHeap.poll().key + min;
        }

        return res;
    }

    private record Pair(int key, int value) {
    }
}
