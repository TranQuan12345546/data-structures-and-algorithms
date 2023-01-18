package leetcode;

public class LeetCode26 {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int count = 1;
            int n = nums.length;
            for (int i = 1; i < n; i++) {
                if (nums[i] != nums[i - 1]) {
                    count++;
                } else {
                    nums[i] = 0;
                }
            }
            return count;
        }
    }
}
