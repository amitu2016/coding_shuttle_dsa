package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public List<List<String>> solveNQueens(int n)
    {
        List<List<String>> result = new ArrayList<>();
        char [][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        solveNQueens(board, 0, result);
        return result;
    }

    private static void solveNQueens(char[][] board, int row, List<List<String>> result) {
        //Base Case
        if (row == board.length) {
            result.add(constructSolution(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)){
                board[row][col] = 'Q';
                solveNQueens(board, row + 1, result);
                board[row][col] = '.';
            }
        }


    }

    private static boolean isSafe(char[][] board, int row, int col) {
        //Check in same column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }
        
        //Check in upper right diagonal
        for (int i = row, j = col; i >= 0 && j >= 0 ; i--, j--) {
            if (board[i][j] == 'Q')
                return  false;
        }

        //Check in upper right diagonal
        for (int i = row, j = col; i >=0 && j < board.length ; i--, j++) {
            if (board[i][j] == 'Q')
                return  false;
        }

        return  true;
    }

    private static List<String> constructSolution(char[][] board) {
        List<String> solution = new ArrayList<>();
        for (char[] row : board) {
            solution.add(new String(row));
        }
        return solution;
    }

    public static void main(String[] args) {
        int n = 1;
        NQueens nQueens = new NQueens();
        List<List<String>> solutions = nQueens.solveNQueens(n);
        for (List<String> solution : solutions) {
            System.out.println(solution);
        }
    }
}
