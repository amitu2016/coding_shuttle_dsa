package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubsequenceArray {

    public static ArrayList<ArrayList<Integer>> AllSubsets(ArrayList<Integer> nums) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> cur = new ArrayList<>();
        Collections.sort(nums);
        subsequenceArrayHelper(nums, ans, cur, 0);
        return ans;
    }

    public static void subsequenceArrayHelper(ArrayList<Integer> nums,
                                              ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> cur, int index) {
        ans.add(new ArrayList<>(cur));

        for(int i = index; i<nums.size(); i++) {
            if(i > index && nums.get(i).equals(nums.get(i-1))) continue;
            cur.add(nums.get(i));
            subsequenceArrayHelper(nums, ans, cur, i+1);
            cur.remove(cur.size()-1);
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        ArrayList<ArrayList<Integer>> ans = AllSubsets(list);
        System.out.println(ans);
    }

}
