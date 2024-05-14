package Arrays;

public class MultipleRotationOfArray {

    public static int[][] multipleLeftRotation(int[] A, int[] B) {

        int n = A.length;
        int m = B.length;

        //Array to store answers
        int[][] ans = new int[m][n];

        //Temporary Array
        int temp[] = new int[2*n];

        //Filling the temporary array
        for (int i = 0; i < n; i++) {
            temp[i] = A[i];
            temp[i+n] = A[i];
        }

        for (int i = 0; i < m; i++) {

            int offset = (B[i]) % n;
            for (int j = 0; j < n; j++) {
                ans[i][j] = temp[j+offset];
            }
        }

        return ans;
    }

    private static void printArray(int[][] ans) {

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {3,2};

        int [][] ans = multipleLeftRotation(a,b);

        printArray(ans);
    }




}
