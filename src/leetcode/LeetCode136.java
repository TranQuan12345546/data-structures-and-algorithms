package leetcode;

public class LeetCode136 {
    public static int singleNumber(int[] nums) {
        int l = nums.length;
        int res = nums[0];
        for( int i = 1; i < l; i++ ){
            res ^= nums[i];
        }
        return  res;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,4,4,1}));;
    }
}
