package leetcode;

public class LeetCode242 {
    public static boolean isAnagram(String s, String t) {
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    count++;
                }
            }
            if (count == 0) {
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("acbs", "awdf"));
    }
}
