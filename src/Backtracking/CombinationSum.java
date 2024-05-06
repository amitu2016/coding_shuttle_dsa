package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public static List<List<Integer>> combinationSum2(int[] candidates, int target)
    {
       List<List<Integer>> ans = new ArrayList<>();

       List<Integer> curr = new ArrayList<>();

        Arrays.sort(candidates);
        combinationSumHelper(candidates, target, ans, curr, 0);
        return ans;
    }

    public static void combinationSumHelper(int[] a, int sum, List<List<Integer>> ans,
                                     List<Integer> cur, int index) {
        if(sum < 0) return;
        if(sum == 0) {
            ans.add(new ArrayList<>(cur));
            return;
        }

        for(int i = index; i<a.length; i++) {
            if(i > index && a[i] == a[i-1]) continue;
            cur.add(a[i]);
            combinationSumHelper(a, sum-a[i], ans, cur, i+1);
            cur.remove(cur.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] a = {8, 1, 3, 7, 2, 1, 5};
        int sum = 12;

        List<List<Integer>> ans = combinationSum2(a,sum);
        System.out.println(ans);

    }
}
