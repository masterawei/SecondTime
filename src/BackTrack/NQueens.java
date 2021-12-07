package BackTrack;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author away
 * @date 2021-12-05 11:07
 */
public class NQueens {
    List<List<String>> res = new LinkedList<>();
    LinkedList<String> path = new LinkedList<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        backtrack(board, 0);
        return res;


    }

    private void backtrack(char[][] board, int row) {
        if (path.size() == board.length) {
            res.add(new LinkedList<>(path));
            return;
        }
        for (int i = 0; i < board.length; i++) {
                board[row][i] = 'Q';
                if (isValid(board, row, i)) {
                    path.add(new String(board[row]));
                    backtrack(board, row+1);

                    path.removeLast();
                }
                board[row][i] = '.';
        }

    }

    boolean isValid(char[][] board, int row, int col) {
        for (int i = 0; i < col; i++) {//同行
            if (board[row][i] == 'Q') {
                return false;
            }
        }
        for (int i = 0; i < row; i++) {//同列
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) {//左上
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row-1, j = col+1; i >= 0 && j < board.length; i--, j++) {//右上
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    @Test
    public void test() {
        solveNQueens(4);
        System.out.println(res);
    }
}
