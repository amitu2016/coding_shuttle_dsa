package Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class TwoSumInArray {
    public static int[] twoSum(int[] nums, int target) {
        // Create an array of pairs (number, original index)
        int[][] numWithIndex = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            numWithIndex[i][0] = nums[i];
            numWithIndex[i][1] = i;
        }

        // Sort the array based on the numbers
        Arrays.sort(numWithIndex, Comparator.comparingInt(a -> a[0]));

        int left = 0;
        int right = numWithIndex.length - 1;

        while (left < right) {
            int sum = numWithIndex[left][0] + numWithIndex[right][0];
            if (sum == target) {
                // Get the indices of the numbers that sum up to the target
                int index1 = numWithIndex[left][1];
                int index2 = numWithIndex[right][1];
                // Return the indices in sorted order
                if (index1 < index2) {
                    return new int[]{index1, index2};
                } else {
                    return new int[]{index2, index1};
                }
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        // Return an empty array if no solution is found
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int[] ans = twoSum(nums, 6);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
