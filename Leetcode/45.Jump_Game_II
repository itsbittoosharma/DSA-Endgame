// Question Link: https://leetcode.com/problems/jump-game-ii/
class Solution {
public:
    int jump(vector<int>& nums) {
        int count=1,jump=nums[0],k=nums[0];
        int size=nums.size();
        if(size==1)
            return 0;
            for(int i = 1;i<size-1;i++){
            jump = max(jump,i+nums[i]);
                k--;
                if(k==0){
                    count++;
                    k= jump-i;
                    
                }
            }
        return count;
        
    }
};
