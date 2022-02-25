class Solution {
    public int compareVersion(String version1, String version2) {
    int p1=0,p2=0;
    while(p1<version1.length() || p2<version2.length()){
        int num1=0,num2=0;
        while(p1<version1.length() && version1.charAt(p1)!='.') num1 = num1*10 + (version1.charAt(p1++) - '0'); // get number in version1..
        while(p2<version2.length() && version2.charAt(p2)!='.') num2 = num2*10 + (version2.charAt(p2++) - '0'); // get number in version2.
        if(num1 != num2) return num1>num2 ? 1:-1;
        p1++;
        p2++;
    }
    return 0;
}
}