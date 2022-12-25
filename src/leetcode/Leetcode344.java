package leetcode;

public class Leetcode344 {
    public void reverseString(char[] s) {
        reverse(s, 0 , s.length - 1);
    }

    public char[] reverse(char[] s, int start, int end) {
        if (start >= end) {
            return s;
        }
        char tmp = s[start];
        s[start] = s[end];
        s[end] = tmp;
        return reverse(s, start + 1, end - 1);

    }
}
