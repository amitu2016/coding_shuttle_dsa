package Backtracking;

public class ValidParentheses {

    public static void validParentheses(int n, String curr, int i, int open, int close){
        if (i == 2*n){
            System.out.println(curr);
            return;
        }

        if (open < n){
            curr = curr + "(";
            validParentheses(n, curr, i+1, open+1, close);
            curr = curr.substring(0, curr.length() -1);
        }

        if (close < open){
            curr = curr + ")";
            validParentheses(n, curr, i+1, open, close+1);
        }

    }

    public static void main(String[] args) {
        int n = 4;
        validParentheses(n,"",0,0,0);
    }
}
