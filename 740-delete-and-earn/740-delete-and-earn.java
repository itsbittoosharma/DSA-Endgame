class Solution {
public int deleteAndEarn(int[] nums) {
        if (nums.length == 0)
            return 0;
        int[] values = new int[10001];
        for (int num : nums)
            values[num] += num;

        int prev1 = 0;
        int prev2 = 0;

        for (int value : values) {
            int tmp = prev1;
            prev1 = Math.max(prev2 + value, prev1);
            prev2 = tmp;
        }
        return prev1;
    }
}