package leetcode;
import java.util.*;

public class LeetCode414 {
    public static int thirdMax(int[] nums) {
        List<Integer> arraylist = new ArrayList<>();
        for (Integer i : nums) {
            arraylist.add(i);
        }
        arraylist.sort(Comparator.comparingInt(o -> (int) o).reversed());
        arraylist.sort((o1, o2) -> o2 - o1);
        System.out.println(arraylist);

        List<Integer> arraylist2 = new ArrayList<>();
        for (Integer i : arraylist) {
            if (!arraylist2.contains(i)) {
                arraylist2.add(i);
            }
        }

        if (arraylist2.size() < 3) {
            return arraylist2.get(0);
        } else return arraylist2.get(2);
    }

    public static void main(String[] args) {
        int[] arr = new int[] {5,-2147483648,1,1};
        System.out.println(thirdMax(arr));
    }
}
