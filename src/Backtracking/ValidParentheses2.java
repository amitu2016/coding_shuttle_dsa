package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class ValidParentheses2 {

    public static List<String> AllParenthesis(int n) {
        return  AllParenthesis(n, "", 0, 0, 0);
    }

    public static List<String> AllParenthesis(int n, String curr, int i, int open, int close){

        List<String> ans = new ArrayList<>();

        if (i == 2*n){
            ans.add(curr);
            return ans;
        }

        if (open < n){
            curr = curr + "(";
            ans.addAll(AllParenthesis(n, curr, i+1, open+1, close));
            curr = curr.substring(0, curr.length() -1);
        }

        if (close < open){
            curr = curr + ")";
            ans.addAll(AllParenthesis(n, curr, i+1, open, close+1));
        }

        return ans;
    }

    public static void main(String[] args) {
        List<String> ans = AllParenthesis(3);
        System.out.println(ans);
    }
}
