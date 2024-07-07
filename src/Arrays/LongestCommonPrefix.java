package Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }

        if (strs.length == 1){
            return strs[0];
        }

        int minLength = Integer.MAX_VALUE;

        for(String str : strs){
            minLength = Math.min(minLength, str.length());
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < minLength; i++) {

            Character currCh = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (currCh != strs[j].charAt(i)){
                    return ans.toString();
                }
            }
            ans.append(currCh);
        }
        return ans.toString();
    }


    public static void main(String[] args) {
        String[] strArr1 = {"do", "done", "doing"};
        String[] strArr2 = {"prime", "protect", "promo"};
        LongestCommonPrefix obj = new LongestCommonPrefix();
        String ans1 = obj.longestCommonPrefix(strArr1);
        String ans2 = obj.longestCommonPrefix(strArr2);
        System.out.println(ans1);
        System.out.println(ans2);
    }
}
