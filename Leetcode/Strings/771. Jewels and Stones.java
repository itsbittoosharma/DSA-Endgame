class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (Character i : stones.toCharArray()) {
            boolean check = jewels.contains(i.toString());
            if (check)
                count++;
        }
        return count;
    }

}