package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    public static List<List<String>> partition(String s)
    {
        List<List<String>> ans = new ArrayList<>();
        List<String> curr = new ArrayList<>();

        partitionHelper(s, ans, curr, 0);

        return ans;

    }

    public static void partitionHelper(String s, List<List<String>> ans, List<String> curr, int index) {

        if (index == s.length()){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)){
                curr.add(s.substring(index, i+1));
                partitionHelper(s, ans, curr, i+1);
                curr.remove(curr.size() - 1); //backtracking
            }
        }
        
    }

    public static boolean isPalindrome(String s, int i, int j){
        while (i <= j){
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abbacd";
        List<List<String>> ans = partition(s);
        System.out.println(ans);
    }
}
