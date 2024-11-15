package org.t1r0.home.hashtable;

import java.util.ArrayList;
import java.util.Objects;

public class MyHashSet {

    private static final int C = 1024;

    private ArrayList[] buckets;

    public MyHashSet() {
        buckets = new ArrayList[C];
    }

    public void add(int key) {
        int bucket = Objects.hashCode(key) % C;
        if (buckets[bucket] == null) {
            buckets[bucket] = new ArrayList();
            buckets[bucket].add(key);
        } else {
            if (!buckets[bucket].contains(key)) {
                buckets[bucket].add(key);
            }
        }
    }

    public void remove(int key) {
        int bucket = Objects.hashCode(key) % C;
        if (buckets[bucket] != null) {
            buckets[bucket].removeIf(e -> e.equals(key));
        }
    }

    public boolean contains(int key) {
        int bucket = Objects.hashCode(key) % C;
        if (buckets[bucket] != null) {
            return buckets[bucket].contains(key);
        }
        return false;
    }
}
