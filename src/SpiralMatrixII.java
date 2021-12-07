/**
 * @author away
 * @date 2021-11-21 8:42
 */
public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int t = 0;
        int r = n-1;
        int b = n-1;
        int l = 0;
        int num = 0;
        while (num <= n*n) {
            for (int i = l; i <= r; i++) {
                matrix[t][i] = num;
                num++;
            }
            t++;
            for (int i = t; i <= b; i++) {
                matrix[i][r] = num;
                num++;
            }
            r--;
            for (int i = r; i >= l; i--) {
                matrix[b][i] = num;
                num++;
            }
            b--;
            for (int i = b; i >= t; i++) {
                matrix[i][l] = num;
                num++;
            }
            l++;
        }

        return matrix;

    }
}
