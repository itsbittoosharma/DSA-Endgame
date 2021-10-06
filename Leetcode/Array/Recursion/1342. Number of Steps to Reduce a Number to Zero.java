class Solution {
    public int numberOfSteps(int num) {
        if(num==0) return 0;
        if(num-1==0) return 1;
        return ((num%2==0)?numberOfSteps(num/2):numberOfSteps(num-1))+1;
    }
}