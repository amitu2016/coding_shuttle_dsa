package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
    public static ArrayList<String> permute(String s){
        ArrayList<String> permutations = new ArrayList<>();
        permute(s, 0, permutations);
        return permutations;
    }

    public static ArrayList<String> permute(String s, int start, ArrayList<String> permutations){

        if(s.length() == start){
           permutations.add(s);
           return permutations;
        }

        for (int i = start; i < s.length(); i++) {
             s = swap(s, start, i);
            permute(s, start + 1, permutations);
            s = swap(s, start, i);
        }
        return permutations;
    }

    private static String swap(String s, int start, int i) {
        // Convert the string to a character array
        char[] charArray = s.toCharArray();

        // Swap the characters at index start and i
        char temp = charArray[start];
        charArray[start] = charArray[i];
        charArray[i] = temp;

        return new String(charArray);
    }


    public static void main(String[] args) {
        String str = "ABC";
        ArrayList<String> ans = permute(str);
        System.out.println(ans);
    }
}
