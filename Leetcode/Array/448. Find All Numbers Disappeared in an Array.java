class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] res = new int[nums.length + 1];

        for (int num : nums) {
            res[num] = num;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i < res.length; i++) {
            if (res[i] == 0) {
                ans.add(i);
            }
        }
        return ans;
    }

}