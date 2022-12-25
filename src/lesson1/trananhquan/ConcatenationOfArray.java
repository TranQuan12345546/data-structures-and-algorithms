package lesson1.trananhquan;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ConcatenationOfArray {
    public int firstUniqChar(String s) {
        int count = -1;
        for (int i = 0; i < s.length(); i++) {
            boolean flag = true;
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    flag = false;
                }
                if (i != 0 && s.charAt(i) == s.charAt(i-1)) {
                    flag = false;
                }
            }
            if (flag) {
                count = i;
                break;
            }
        }
        return count;
    }
}
