class TwoSum_01 {
    public int[] twoSum(int[] nums, int target) {
        int ans = 0;
        int[] intArr = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length - i - 1; j++) {
                ans = nums[i] + nums[j];
                if (ans == target) {
                    intArr[0] = i;
                    intArr[1] = j;
                }
            }
        }
        return intArr;
    }
}
