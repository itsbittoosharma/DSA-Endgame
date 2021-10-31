class Solution {
    public String sortSentence(String s) {
        String[] word = s.split(" "), ans = new String[word.length];
        for (String words : word) {
            int i = words.length() - 1;
            ans[words.charAt(i) - '1'] = words.substring(0, i);
        }
        return String.join(" ", ans);
    }
}
