package Arrays;

import java.util.ArrayList;

public class MaxAbsDifference {
    public static int maxArr(ArrayList<Integer> A) {

        int n = A.size();

        int maxAbsDiff = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maxAbsDiff = Math.max(maxAbsDiff, Math.abs(A.get(i) - A.get(j)) + Math.abs(i - j));
            }
        }

        return maxAbsDiff;

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
