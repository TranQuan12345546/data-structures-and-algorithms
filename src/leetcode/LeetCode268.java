package leetcode;

public class LeetCode268 {
    public static void main(String[] args) {
        int[] num = {0,2,3,1,5};
        System.out.println(missingNumber(num));
    }

    public static int missingNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i <= nums.length ; ) {
            int count = 0;
            for (int j = 0; j < nums.length ; j++) {
                if (nums[j] == i) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                result = i;
                break;
            } else {
                i++;
            }
        }
        return result;
    }
}

