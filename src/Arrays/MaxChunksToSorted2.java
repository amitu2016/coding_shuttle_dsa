package Arrays;

public class MaxChunksToSorted2 {

    public int maxChunksToSorted(int[] arr) {
       int n = arr.length;

       int[] leftMax = new int[n];
       int[] rightMin = new int[n];

       leftMax[0] = arr[0];
       rightMin[n-1] = arr[n-1];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }

        for (int i = n-2; i >= 0; i--) {
            rightMin[i] = Math.min(arr[i], rightMin[i+1]);
        }

        int chunks = 1;
        for (int i = 0; i < n-1; i++) {
            if (leftMax[i] <= rightMin[i+1]) {
                chunks++;
            }
        }

        return chunks;

    }

    public static void main(String[] args) {
        int[] arr = {8, 2, 5, 2};
        MaxChunksToSorted2 obj = new MaxChunksToSorted2();
        int ans = obj.maxChunksToSorted(arr);
        System.out.println(ans);
    }
}
