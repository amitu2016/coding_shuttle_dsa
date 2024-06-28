package Arrays;

public class LongestCommonPrefixOptimized {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Use the first string as the reference prefix
        String prefix = strs[0];

        // Iterate over the rest of the strings
        for (int i = 1; i < strs.length; i++) {
            // Adjust the prefix length to match current string's prefix
            while (strs[i].indexOf(prefix) != 0) {
                // Shorten the prefix by one character each time there's no match
                prefix = prefix.substring(0, prefix.length() - 1);
                // If the prefix becomes empty, return an empty string
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] {"hello", "help", "heskel"})); // Output: "he"
        System.out.println(longestCommonPrefix(new String[] {"prime", "protect", "promo"})); // Output: "pr"
        System.out.println(longestCommonPrefix(new String[] {"apple", "app"})); // Output: "app"
    }
}
