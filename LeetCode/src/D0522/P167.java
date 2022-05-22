package D0522;

public class P167 {
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int start = 0, end = numbers.length - 1;

            while (start < end) {
                if (target == numbers[start] + numbers[end]) break;
                if (target > numbers[start] + numbers[end]) start++;
                else end--;
            }

            return new int[]{start+1, end+1};
        }
    }
}
