package org.t1r0.home.hashtable;

import java.util.ArrayList;
import java.util.Objects;

public class MyHashMap {

    private static final int C = 1024;

    private Bucket[] buckets;

    public MyHashMap() {
        buckets = new Bucket[C];
    }

    public void put(int key, int value) {
        int bucket = bucket(key);
        if (buckets[bucket] == null) {
            buckets[bucket] = new Bucket();
        }
        buckets[bucket].add(key, value);
    }

    public int get(int key) {
        int bucket = bucket(key);
        if (buckets[bucket] != null) {
            return buckets[bucket].get(key);
        }
        return -1;
    }

    public void remove(int key) {
        int bucket = bucket(key);
        if (buckets[bucket] != null) {
            buckets[bucket].remove(key);
        }
    }

    private int bucket(int key) {
        return Objects.hashCode(key) % C;
    }

    private static class Bucket {
        private ArrayList<Entry> list = new ArrayList<>();

        public void add(int key, int value) {
            for (Entry entry : list) {
                if (entry.key == key) {
                    entry.value = value;
                }
            }
            Entry entry = new Entry();
            entry.key = key;
            entry.value = value;
            list.add(entry);
        }

        public int get(int key) {
            for (Entry entry : list) {
                if (entry.key == key) {
                    return entry.value;
                }
            }
            return -1;
        }

        public void remove(int key) {
            list.removeIf(entry -> entry.key == key);
        }

        static class Entry {
            int key;
            int value;
        }
    }
}
