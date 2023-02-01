package leetcode;

public class LeetCode706 {
    class MyHashMap {
        int[] hashMap;

        public MyHashMap() {
            hashMap = new int[1000001];
            for (int i = 0; i < hashMap.length; i++) hashMap[i] = -1;
        }

        public void put(int key, int value) {
            hashMap[key] = value;
        }

        public int get(int key) {
            return hashMap[key];
        }

        public void remove(int key) {
            hashMap[key] = -1;
        }
    }
}
