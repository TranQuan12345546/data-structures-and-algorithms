package leetcode;

public class LeetCode169 {
    public int majorityElement(int[] nums) {
        int count = 0;
        int index = 0;
        for (int num: nums) {
            if (count == 0) {
                index = num;
            }
            if (num == index) {
                count++;
            } else count--;
        }
        return index;
    }
}
