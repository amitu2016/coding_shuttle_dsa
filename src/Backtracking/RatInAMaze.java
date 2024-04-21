package Backtracking;

public class RatInAMaze {

    public static void main(String[] args) {
        int mat[][] = {
                {1,1,1,0},
                {1,0,0,1},
                {1,1,0,0},
                {1,1,1,1}
        };
        int n = mat.length;
        int m = mat[0].length;

        boolean vis[][] = new boolean[n][m];
    }

    public static boolean isValid(int i, int j, int mat[][], boolean vis[][], int n, int m){
        if (i < n && i >= 0 && j < m && j >=0 && mat[i][j] == 1 && vis[i][j] == false){
            return true;
        }else {
            return false;
        }
    }

    public static void ratInAMaze(int mat[][], boolean vis[][], int i, int j, String path, int n, int m){
        if (i == n-1 && j == m-1){
            System.out.println(path);
            return;
        }

        //Down
        if (isValid(i+1, j, mat, vis, n, m)){
            vis[i+1][j] = true;
            ratInAMaze(mat, vis, i+1, j, path+'D', n, m);
            vis[i+1][j] = false;
        }


    }


}
