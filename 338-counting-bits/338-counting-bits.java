class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
			for(int i=0;i<=n;i++) {
				char binary[]=Integer.toBinaryString(i).toCharArray();
				int count=0;
				for(char c:binary) {
					if(c=='1') {
						count++;
					}
				}
				ans[i]=count;
				
			}
        return ans;
    }
}