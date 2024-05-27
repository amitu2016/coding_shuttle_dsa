package Arrays;

import java.util.Arrays;

public class ChocolateDistributionProblem {

    public int findMinDiff(int[] arr, int m)
    {
        int n = arr.length;

        if (n == 0 || m == 0) {
            return 0;
        }

        if (n < m){
            return -1;
        }

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i + m -1 < n; i++) {
            int diff = arr[i+m-1] - arr[i];
            minDiff = Math.min(minDiff,diff);
        }

        return  minDiff;
    }

    public static void main(String[] args) {
        ChocolateDistributionProblem cd = new ChocolateDistributionProblem();

        int[] arr1 = {7, 3, 2, 4, 9, 12, 56};
        int m1 = 3;
        System.out.println(cd.findMinDiff(arr1, m1));  // Output: 2

        int[] arr2 = {3, 4, 1, 9, 56, 7, 9, 12};
        int m2 = 5;
        System.out.println(cd.findMinDiff(arr2, m2));  // Output: 6
    }
}
