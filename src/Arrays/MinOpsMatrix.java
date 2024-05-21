package Arrays;

import java.util.Arrays;

import java.util.Arrays;

public class MinOpsMatrix {
    public static int minOperations(int n, int m, int k, int A[][]) {
        if (n == 0) {
            return 0;
        }

        int total = n * m;

        int[] b = new int[total];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i * m + j] = A[i][j];
            }
        }
        Arrays.sort(b);

        // Check if all elements can be made equal
        int remainder = b[0] % k;
        for (int i = 1; i < total; i++) {
            if (b[i] % k != remainder) {
                return -1;  // It's impossible to make all elements equal
            }
        }

        int median = b[total / 2];
        return minOperationsHelper(b, median, k);
    }

    static int minOperationsHelper(int b[], int m, int k) {
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            count += Math.abs(b[i] - m) / k;
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] A = {
                {628, 550, 934, 955, 239, 454},
                {674, 198, 318, 320, 711, 748},
                {381, 329, 811, 65, 913, 222},
                {28, 688, 852, 779, 306, 954},
                {838, 567, 658, 52, 664, 370},
                {707, 665, 692, 130, 411, 983},
                {345, 658, 320, 585, 578, 775},
                {775, 302, 136, 436, 67, 592},
                {47, 615, 658, 7, 693, 581}
        };

        int K = 77;
        int n = A.length;
        int m = A[0].length;
        System.out.println(minOperations(n, m, K, A));  // Expected output: the minimum number of operations or -1 if not possible
    }
}

