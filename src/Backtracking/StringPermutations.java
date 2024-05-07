package Backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class StringPermutations {
    public static ArrayList<String> permute(String s) {
        ArrayList<String> permutations = new ArrayList<>();
        permute(s, 0, permutations);
        Collections.sort(permutations);
        return permutations;
    }

    public static void permute(String s, int start, ArrayList<String> permutations) {
        if (s.length() == start) {
            permutations.add(s);
            return;
        }

        // Use a HashSet to track characters already swapped at a position
        HashSet<Character> swapped = new HashSet<>();
        for (int i = start; i < s.length(); i++) {
            // Skip swapping if the character is already swapped at this position
            if (!swapped.contains(s.charAt(i))) {
                s = swap(s, start, i);
                permute(s, start + 1, permutations);
                s = swap(s, start, i);
                swapped.add(s.charAt(i));
            }
        }
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
        String str = "AAA";
        ArrayList<String> ans = permute(str);
        System.out.println(ans);
    }
}
