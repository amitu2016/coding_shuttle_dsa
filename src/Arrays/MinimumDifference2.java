package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumDifference2 {
    public static List<List< Integer>> minimumAbsDifference(int[] arr)
    {
        List<List<Integer>> ans = new ArrayList<>();

        int n = arr.length;

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        //Find minimum difference
        for (int i = 0; i < n - 1; i++) {
            minDiff = Math.min(minDiff, arr[i + 1] - arr[i]);
        }

      //  System.out.println(minDiff);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] - arr[i] == minDiff){
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[i+1]);
                ans.add(temp);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {12, 9, 8, 2, 11};
         List<List<Integer>> ans =  minimumAbsDifference(arr);
        System.out.println(ans);
    }
}
