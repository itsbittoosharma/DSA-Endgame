class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        s=new String(arr);
        arr=t.toCharArray();
        Arrays.sort(arr);
        t=new String(arr);
        return s.compareTo(t)==0;
    }
}