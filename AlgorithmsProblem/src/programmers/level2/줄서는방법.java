package programmers.level2;

// 백트래킹 방법으로 풀었는데.. 이방법은 효율성이 떨어지는듯하다.
import java.util.ArrayList;
import java.util.List;

public class 줄서는방법 {
    static class Solution {
        public List<Integer> solution(int n, long k) {
            List<List<Integer>> res = new ArrayList<>();
            int[] nums = new int[n];
            for (int i = 1; i <= n; i++) {
                nums[i-1] = i;
            }
            backTrack(res, new ArrayList<>(), nums, n);

            return res.get((int)k-1);
        }

        private void backTrack(List<List<Integer>> res,
                               List<Integer> curr, int[] nums, int n) {
            if (curr.size() == n) {
                res.add(new ArrayList<>(curr));
                return;
            }

            for (int i = 0; i < n; i++) {
                if (curr.contains(nums[i])) continue;
                curr.add(nums[i]);
                backTrack(res, curr, nums, n);
                curr.remove(curr.size()-1);
            }
        }

        public static void main(String[] args) {
            Solution t = new Solution();
            System.out.println(t.solution(3, 5));
        }
    }
}
