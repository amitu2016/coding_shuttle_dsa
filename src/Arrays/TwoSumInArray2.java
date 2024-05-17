package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSumInArray2 {

    public static List<List<Integer>> twoSum(int[] a, int sum){
        int l = 0;
        int r = a.length - 1;
        Arrays.sort(a);
        List<List<Integer>> ans = new ArrayList<>();
        while(l < r){
           if (a[l] + a[r] < sum){
               l++;
           }else if(a[l] + a[r] > sum){
               r--;
           }else{
               ArrayList<Integer> temp = new ArrayList<>();
               temp.add(a[l]);
               temp.add(a[r]);
               ans.add(temp);
               l++;
               r--;
           }

        }
        return ans;
    }

    public static void main(String[] args) {
        int a[] = {4,2,-1,-3,0,1,2,3};
        int target = 5;
        List<List<Integer>> ans = twoSum(a,target);
        System.out.println(ans);
    }

}
