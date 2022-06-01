package programmers.level1;

import java.util.HashSet;
import java.util.Set;

public class 폰켓몬 {
    class Solution {
        public int solution(int[] nums) {
            int n = nums.length / 2;

            Set<Integer> set = new HashSet<Integer>();
            for (int i = 0; i < nums.length; i++) {
                set.add(nums[i]);
            }

            if (n > set.size()) return set.size();
            return n;
        }
    }
}
