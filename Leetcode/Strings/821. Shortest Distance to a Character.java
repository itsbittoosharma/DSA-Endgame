class Solution {
    public int[] shortestToChar(String s, char c) {

        ArrayList<Integer> a = new ArrayList<Integer>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c)
                a.add(i);
        }

        int[] ans = new int[s.length()];
        int p = 0;
        for (int i = 0; i < s.length(); i++) {

            int aa = (Math.abs(a.get(p) - i));
            if (p + 1 > a.size() - 1) {
                ans[i] = aa;
                continue;
            }
            int b = (Math.abs(a.get(p + 1) - i));
            if (aa < b) {
                ans[i] = aa;
            } else if (b < aa) {
                ans[i] = b;
                p += 1;
            }
            if (aa == b) {
                ans[i] = b;
                p += 1;
            }

        }
        return ans;
    }
}