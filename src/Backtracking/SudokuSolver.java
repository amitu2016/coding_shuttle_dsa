package Backtracking;
public class SudokuSolver {

    public static char[][] solveSudoku(char[][] board) {
        int a[][] = twoDCharArrayToIntArray(board);
        solveSudoku(a, 0, 0);
        board = intArrayToCharArray(a);
        return board;
    }

    private static boolean solveSudoku(int[][] a, int row, int col) {
        if(row == 9) return true;
        if(col == 9) return solveSudoku(a, row+1, 0);
        if(a[row][col] != 0) return solveSudoku(a, row, col+1);

        for(int i = 1; i<=9; i++) {
            if(isSafeSudoku(a, row, col, i)) {
                a[row][col] = i;
                if(solveSudoku(a, row, col+1)) return true;
                a[row][col] = 0; // backtracking
            }
        }
        return false;
    }

    private static boolean isSafeSudoku(int[][] a, int row, int col, int num) {
        for(int i = 0; i<9; i++) {
            if(a[row][i] == num) return false;
            if(a[i][col] == num) return false;
        }
        int gridRow = row/3;
        int gridCol = col/3;
        for(int i = 0; i<3; i++) {
            for(int j = 0; j<3; j++) {
                int cellRow = 3*gridRow+i;
                int cellCol = 3*gridCol+j;
                if(a[cellRow][cellCol] == num) return false;
            }
        }
        return true;
    }


    public static int[][] twoDCharArrayToIntArray(char[][] charArray) {
        int[][] intArray = new int[charArray.length][charArray[0].length];
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray[i].length; j++) {
                // Convert character to integer
                if (charArray[i][j] == '.') {
                    intArray[i][j] = 0;
                } else {
                    intArray[i][j] = Character.getNumericValue(charArray[i][j]);
                }
            }
        }
        return intArray;
    }

    public static char[][] intArrayToCharArray(int[][] intArray) {
        char[][] charArray = new char[intArray.length][intArray[0].length];
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                // Convert integer to character
                if (intArray[i][j] == 0) {
                    charArray[i][j] = '.';
                } else {
                    charArray[i][j] = Character.forDigit(intArray[i][j], 10);
                }
            }
        }
        return charArray;
    }


    public static void main(String[] args) {
        char[][] input ={
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        char[][] board = solveSudoku(input);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }


    }

}
