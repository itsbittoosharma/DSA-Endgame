class Solution {
    public void solveSudoku(char[][] board) {
        recursion(board,0,0);
    }
     
    public boolean isValid(char[][] board,int row,int col,int val)
    { 
        for(int n=0;n<9;n++)
        {
            if(board[row][n]==(char)(val+'0')) return false;
            if(board[n][col]==(char)(val+'0')) return false;
        }
        int sRow=(row/3)*3;
        int sCol=(col/3)*3;
        for(int i=0;i<3;i++,sRow++,sCol=col/3*3)
        {
            for(int j=0;j<3;j++,sCol++)
            {
                if(board[sRow][sCol]==(char)(val+'0')) return false;
            }
        }
        return true;
    }
    
    public boolean recursion(char[][] board, int row, int col)
    {
        if(row==8 && col==9) return true;
        if(col==9) {row+=1; col=0;}
        if(board[row][col]!='.') return recursion(board,row,col+1);
        // for(int i=row;i<9;i++)
        // {
        //     for(int j=col;j<9;j++)
        //     {
        //         if(board[i][j]=='.')
        //         {
        //             for(int k=1;k<10;k++)
        //             {
        //                 if(isValid(board,i,j,k))
        //                 {
        //                     board[i][j]=(char)(k+'0');
        //                     if(recursion(board,row,col+1)) return true;
        //                     else board[i][j]='.';
        //                 }
        //             }
        //         }
        //     }
        // }
        
        for(int k=1;k<10;k++)
                    {
                        if(isValid(board,row,col,k))
                        {
                            board[row][col]=(char)(k+'0');
                            if(recursion(board,row,col+1)) return true;
                            else board[row][col]='.';
                        }
                    }
        return false;
    }
}