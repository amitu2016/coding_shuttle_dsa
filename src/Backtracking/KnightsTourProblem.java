package Backtracking;

public class KnightsTourProblem {

    public static int[][] knightTour(int n, int m) {
        //Declaring the answer array
        int[][] a = new int[n][m];

        //Fill the array with -1 value
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = -1;
            }
        }

        //First array element is 0
        a[0][0] = 0;

        //Valid moves in x and y directions
        int movesX[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int movesY[] = {1, 2, 2, 1, -1, -2, -2, -1};

        // Helper function to find the knight's tour
        boolean isValidTour = knightsTourHelper(n, m, a, movesX, movesY, 0, 0, 1);

        if (!isValidTour) {
            // If a valid knight's tour is not possible, fill the matrix with -1
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = -1;
                }
            }
        }

        return a;
    }

    public static boolean knightsTourHelper(int n, int m, int[][] a, int[] movesX,
                                          int[] movesY, int currX, int currY, int step) {
        //Base case
        if (step == n*m) {
            return true;
        }

        for (int i = 0; i < 8; i++) {
            int nextX = currX + movesX[i];
            int nextY = currY + movesY[i];

            if (isValid(a,n,m,nextX,nextY)){
                a[nextX][nextY] = step;
                boolean isCompleted = knightsTourHelper(n,m,a,movesX,movesY,nextX,nextY,step+1);
                if (isCompleted){
                    return true;
                }else {
                    a[nextX][nextY] = -1;
                }
            }
        }
        return false;
    }

    public static boolean isValid(int[][] a, int n, int m, int x, int y){
        return x >= 0 && y >= 0 && x < n && y < m && a[x][y] == -1;
    }


    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        int [][] a = knightTour(n,m);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
