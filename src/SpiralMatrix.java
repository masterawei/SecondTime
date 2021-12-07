import java.util.LinkedList;
import java.util.List;

/**
 * @author away
 * @date 2021-11-21 9:03
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new LinkedList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int l = 0;
        int r =col-1;
        int t = 0;
        int b = row - 1;
        int count = 0;
        int eleNum = row*col;
        while (true) {
            for (int i = l; i <= r; i++) {
                res.add(matrix[t][i]);
                count++;
            }
            t++;
            if (count == eleNum) {
                break;
            }
            for (int i = t; i <= b; i++) {
                res.add(matrix[i][r]);
                count++;
            }
            r--;
            if (count == eleNum) {
                break;
            }
            for (int i = r; i >= l; i--) {
                res.add(matrix[b][i]);
                count++;
            }
            b--;
            if (count == eleNum) {
                break;
            }
            for (int i = b; i >= t; i--) {
                res.add(matrix[i][l]);
                count++;
            }
            l++;
            if (count == eleNum) {
                break;
            }

        }
        return res;

    }
}
