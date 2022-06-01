package programmers.level1;

public class 소수만들기 {
    class Solution {
        public int solution(int[] nums) {
            int answer = 0;
            boolean[] isSosu = new boolean[3001];
            for (int i = 0; i < isSosu.length; i++) {
                isSosu[i] = false;
            }

            int count = 0;
            for (int i = 2; i < 3001; i++) {
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0) count++;
                }
                if (count == 1) isSosu[i] = true;
            }

            int[] arr = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    for (int k = j+1; k < nums.length; k++) {
                        arr[i] = nums[i] + nums[j] + nums[k];
                        if (isSosu[arr[i]]) answer++;
                    }
                }
            }

            return answer;
        }
    }
}
