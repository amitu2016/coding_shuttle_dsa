package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumInArray {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            List<List<Integer>> temp = twoSum(nums, -nums[i], i + 1);
            for(List<Integer> list : temp){
                list.add(0, nums[i]);
                ans.add(list);
            }
        }

        return ans;
    }

    public static List<List<Integer>> twoSum(int[] a, int sum, int startFrom){
        int l = startFrom;
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
        int [] nums = {-2, 0, 1, 2, 1};
        List<List<Integer>> ans = threeSum(nums);
        System.out.println(ans);
    }
}
