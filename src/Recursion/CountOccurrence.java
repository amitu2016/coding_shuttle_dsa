package Recursion;

public class CountOccurrence {

    public static int countOccurrence(String t, String s){
        return countOccurrenceHelper(t,s,0);
    }

    public static int countOccurrenceHelper(String t, String s, int i){
        if (i > s.length() - t.length()){
            return 0;
        }

        int subProblem = countOccurrenceHelper(t, s, i+1);

        boolean startingCharsMatch = s.substring(i, i+t.length()).equals(t);

        if (startingCharsMatch){
            return subProblem + 1;
        }else {
            return subProblem;
        }
    }

    public static void main(String[] args) {
        String t = "aba";
        String s = "abababbababb";

        System.out.println(countOccurrence(t,s));
    }

}
