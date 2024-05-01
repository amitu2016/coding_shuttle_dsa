package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class SmartKeypad {
    public static List<String> letterCombinations(String digits) {
        String map[] = {
                "",
                "",
                "abc",
                "def","ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        List<String> ans = new ArrayList<>();
        letterCombinations(digits, map, 0, ans, "");
        return ans;
    }

    public static void letterCombinations(String digits, String[] map, int index, List<String> ans, String curr) {

        if (index == digits.length()){
            ans.add(curr);
            return;
        }

        int keypadNumber = digits.charAt(index) - '0';

        String keypadString = map[keypadNumber];

        for (int i = 0; i < keypadString.length(); i++) {
            letterCombinations(digits, map, index+1, ans, curr+keypadString.charAt(i));
        }

    }

    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }
}
