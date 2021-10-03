class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
        int k=0;
        int i;
        int j;
        int[] ans= new int[N*N];
        for(i=0; i<N; i++){
            for(j=0; j<N; j++){
                ans[k++]= Mat[i][j];
            }
        }
        Arrays.sort(ans);
        k=0;
        for(i=0; i<N; i++){
            for(j=0; j<N; j++){
                Mat[i][j]= ans[k++];
            
            }
        }
        return Mat;
    }
};