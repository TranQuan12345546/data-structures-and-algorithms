package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode118 {
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> row, prev = null;

            for (int i = 0; i < numRows; i++) {
                row = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    if(j == 0 || j == i) {
                        row.add(1);
                    } else {
                        row.add(prev.get(j - 1) + prev.get(j));
                    }
                }
                prev = row;
                ans.add(row);
            }
            return ans;
        }

        public List<List<Integer>> generate2(int numRows) {
            List<List<Integer>> ans = new ArrayList<List<Integer>>();
            for(int i =0;i<numRows;i++){
                List<Integer> store = new ArrayList<>();
                int val =1;
                int k =1;
                store.add(val);
                if(i==0){
                    ans.add(store);
                    continue;
                }

                for(int j =0;j<i;j++){
                    val = ((i-j)*k)/(j+1);
                    store.add(val);
                    k = val;
                }
                ans.add(store);
            }
            return ans;
        }
    }
}
