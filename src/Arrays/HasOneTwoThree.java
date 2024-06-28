package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HasOneTwoThree {

    public static List<Integer> find123Digits(int[] arr, int n)
    {
        List<Integer> result = new ArrayList<>();

        for(int i: arr){
            if(contains123Digit(i)){
                result.add(i);
            }
        }

        Collections.sort(result);
        return result;
    }

    private static boolean contains123Digit(int i) {
        boolean containsOne = false;
        boolean containsTwo = false;
        boolean containsThree = false;

        while(i > 0){
            int num = i % 10;
            if (num == 1){
                containsOne = true;
            } else if (num == 2) {
                containsTwo = true;
            } else if (num == 3) {
                containsThree = true;

            }
            i /= 10;
        }
        return containsOne && containsTwo && containsThree;
    }

    public static void main(String[] args) {
       int[] arr = {321, 123, 89, 32, 11};
       int[] arr2 = {8, 9};
        System.out.println(find123Digits(arr, arr.length));
        System.out.println(find123Digits(arr2, arr2.length));
    }
}
