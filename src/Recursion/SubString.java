package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubString {

    public static List<String> findSubString(String s){
       return findSubString(s,0,"");
    }

    public static List<String> findSubString(String s, int i, String curr){

        if (i == s.length()){
            return new ArrayList<>();
        }else{
            List<String> s1 = findSubString(s, i+1, curr+s.charAt(i));
            List<String> s2 = findSubString(s, i+1, curr);
            s2.addAll(s1);

            return s2;
        }


    }

    public static void main(String[] args) {
      List<String > ans = findSubString("abc");
        System.out.println(ans);
    }
}
