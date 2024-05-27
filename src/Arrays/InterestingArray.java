package Arrays;

import java.util.Arrays;

public class InterestingArray {
    public static int isInteresting(int[] arr)
    {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        if (sum % 2 == 0) {
            return 1;
        }else{
            return 0;
        }
    }
}
