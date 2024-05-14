package Arrays;

import java.util.ArrayList;

public class MaxAbsDifferenceOptimized {

    public static int maxArr(ArrayList<Integer> A) {
        // Initialize variables to store maximum and minimum values of A[i] + i and A[i] - i
        int maxA = Integer.MIN_VALUE; // Maximum value of A[i] + i
        int minA = Integer.MAX_VALUE; // Minimum value of A[i] + i
        int maxB = Integer.MIN_VALUE; // Maximum value of A[i] - i
        int minB = Integer.MAX_VALUE; // Minimum value of A[i] - i

        // Iterate through the array to calculate the maximum and minimum values of A[i] + i and A[i] - i
        for (int i = 0; i < A.size(); i++) {
            // Update maxA with the maximum value of A[i] + i
            maxA = Math.max(maxA, A.get(i) + i);
            // Update minA with the minimum value of A[i] + i
            minA = Math.min(minA, A.get(i) + i);
            // Update maxB with the maximum value of A[i] - i
            maxB = Math.max(maxB, A.get(i) - i);
            // Update minB with the minimum value of A[i] - i
            minB = Math.min(minB, A.get(i) - i);
        }

        // Calculate the maximum absolute difference between maxA - minA and maxB - minB
        return Math.max(maxA - minA, maxB - minB);
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(-2);
        a.add(5);
        a.add(-4);
        System.out.println(maxArr(a));
    }

}
