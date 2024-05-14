package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumDifference {

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        int n = arr.length;
        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < n - 1; i++) {
            int absDiff = arr[i + 1] - arr[i];
            if (absDiff < diff) {
                res.clear(); // Clear the result list if a smaller difference is found
                diff = absDiff;
                List<Integer> ans = new ArrayList<>();
                ans.add(arr[i]);
                ans.add(arr[i + 1]);
                res.add(ans);
            } else if (absDiff == diff) {
                List<Integer> ans = new ArrayList<>();
                ans.add(arr[i]);
                ans.add(arr[i + 1]);
                res.add(ans);
            }
        }

        return res;
    }


    public static void main(String[] args) {
        int arr[] = {12, 9, 8, 2, 11};
        List<List< Integer>> res = minimumAbsDifference(arr);
        System.out.println(res);
    }
}
