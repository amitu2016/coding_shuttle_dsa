package Arrays;

import java.util.Arrays;

public class TwoSumInArray {
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;

        int[] ans = new int[2];
        int i = 0;

        Arrays.sort(nums);

        while(left < right){
            if (nums[left] + nums[right] > target) {
                right--;
            } else if (nums[left] + nums[right] < target) {
                left++;
            }else {
                ans[i] = left;
                ans[i+1] = right;
                i+=2;
                left++;
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int[] ans = twoSum(nums, 6);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
