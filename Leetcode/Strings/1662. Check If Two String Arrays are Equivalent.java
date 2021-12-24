class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String word1_sum= "";
        String word2_sum= "";
        for(int i=0; i<word1.length; i++){
            word1_sum += word1[i];
        }
        for(int i=0; i<word2.length; i++){
            word2_sum += word2[i];
        }
        return((word1_sum).equals(word2_sum));
    }
}