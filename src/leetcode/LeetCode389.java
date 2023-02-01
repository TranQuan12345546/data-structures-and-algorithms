package leetcode;

import java.util.Arrays;

public class LeetCode389 {
    public char findTheDifference(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return tArr[sArr.length + 1];
    }
}
