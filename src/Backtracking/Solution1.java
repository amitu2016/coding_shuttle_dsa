package Backtracking;

import java.util.ArrayList;

public class Solution1 {

    public static ArrayList<String> findPath(int[][] arr, int n) {
        boolean vis[][] = new boolean[n][n];
        vis[0][0] = true;
        ArrayList<String> ans = findPath(arr, vis, 0, 0, "", n);
        return ans;
    }

    public static boolean isValid(int i, int j, int arr[][], boolean vis[][], int n) {
        if (i < n && i >= 0 && j < n && j >= 0 && arr[i][j] == 1 && !vis[i][j]) {
            return true;
        } else {
            return false;
        }
    }

    public static ArrayList<String> findPath(int[][] arr, boolean[][] vis, int i, int j, String path, int n) {
        ArrayList<String> ans = new ArrayList<>();

        //If first element itself is not valid
        if(arr[0][0] == 0){
            return new ArrayList<>();
        }

        //If reached the destination
        if (i == n - 1 && j == n - 1) {
            ans.add(path);
            return ans; // Return the path found
        }

        // Down
        if (isValid(i + 1, j, arr, vis, n)) {
            vis[i + 1][j] = true;
            ans.addAll(findPath(arr, vis, i + 1, j, path + "D", n)); // AddAll results of recursive call
            vis[i + 1][j] = false;
        }

        // Left
        if (isValid(i, j - 1, arr, vis, n)) {
            vis[i][j - 1] = true;
            ans.addAll(findPath(arr, vis, i, j - 1, path + "L", n));
            vis[i][j - 1] = false;
        }

        // Right
        if (isValid(i, j + 1, arr, vis, n)) {
            vis[i][j + 1] = true;
            ans.addAll(findPath(arr, vis, i, j + 1, path + "R", n));
            vis[i][j + 1] = false;
        }

        // Up
        if (isValid(i - 1, j, arr, vis, n)) {
            vis[i - 1][j] = true;
            ans.addAll(findPath(arr, vis, i - 1, j, path + "U", n));
            vis[i - 1][j] = false;
        }

        return ans;
    }

    public static void main(String[] args) {
//        int arr[][] = {
//                {1, 1, 1, 0},
//                {1, 0, 0, 1},
//                {1, 1, 0, 0},
//                {1, 1, 1, 1}
//        };

        int arr[][] = {
                {0, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };

        int n = arr.length;

        ArrayList<String> ans = findPath(arr, n);

        System.out.println(ans);
    }
}
