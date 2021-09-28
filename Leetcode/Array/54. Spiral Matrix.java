import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int l = 0, r = matrix[0].length - 1, u = 0, d = matrix.length - 1;
        int turn = 0;
        List<Integer> ans = new ArrayList<Integer>();
        while (l <= r && u <= d) {
            if (turn == 0) {
                for (int p = l; p <= r; p++) {
                    ans.add(matrix[u][p]);

                }
                u++;
            }
            if (turn == 1) {
                for (int p = u; p <= d; p++) {
                    ans.add(matrix[p][r]);

                }
                r--;
            }
            if (turn == 2) {
                for (int p = r; p >= l; p--) {
                    ans.add(matrix[d][p]);

                }
                d--;
            }
            if (turn == 3) {
                for (int p = d; p >= u; p--) {
                    ans.add(matrix[p][l]);

                }
                l++;
            }
            turn = (turn + 1) % 4;
        }
        return ans;
    }
}