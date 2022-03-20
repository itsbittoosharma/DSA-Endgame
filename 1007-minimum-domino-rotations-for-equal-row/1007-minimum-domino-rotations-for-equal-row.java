class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int num1 = tops[0];
        int num2 = bottoms[0];
		//no. of times num1 or num2 needed to swap
        int c1 = checkCount(num1,tops,bottoms);
        int c2 = checkCount(num1,bottoms,tops);
        int c3 = checkCount(num2,tops,bottoms);
        int c4 = checkCount(num2,bottoms,tops);
        int res = Math.min(Math.min(c1,c2),Math.min(c3,c4));
        return res==Integer.MAX_VALUE?-1:res;
    }
    int checkCount(int num1,int[] tops,int[] bottoms){
        int count=0;
        for(int i=0;i<tops.length; i++){
            if(num1==tops[i]){
                //count++;
            }else if(num1==bottoms[i]){
                count++;
            }else{
                count=Integer.MAX_VALUE;
                return count;
            }
        }
        return count;
    }
}