package Arrays;

public class MaxChunksToSorted {
    public static int maxChunksToSorted(int[] arr) {
        int n = arr.length;

        int maxSofar = 0, chunk = 0;

        for (int i = 0; i < n; i++) {
            maxSofar = Math.max(maxSofar, arr[i]);
            if (maxSofar == i)
                chunk++;
        }

        return chunk;

    }

    public static void main(String[] args) {
        int [] arr = {0, 1, 2, 4, 3};
        System.out.println(maxChunksToSorted(arr));
    }
}
