class Solution {
    public int balancedStringSplit(String s) {
        int nums = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                nums++;
            } else {
                nums--;
            }
            if (nums == 0) {
                count++;
            }
        }
        return count;
    }
}
