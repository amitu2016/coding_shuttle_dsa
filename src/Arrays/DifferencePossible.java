package Arrays;

import java.util.HashSet;
import java.util.Set;

public class DifferencePossible {

    public boolean diffPossible(int[] arr, int k)
    {
        Set<Integer> set = new HashSet<>();
        int n = arr.length;

        for (int j : arr) {
            set.add(j);
        }

        for (int j : arr) {
            if (set.contains(j - k))
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
       int[]  arr1 = {1, 1, 1, 2, 2, 6, 8, 8, 8};
       int[] arr2 = {1, 4, 5, 8, 10, 14, 18};
       int k1 = 0, k2 = 5;
       DifferencePossible obj = new DifferencePossible();
        System.out.println(obj.diffPossible(arr1,k1));
        System.out.println(obj.diffPossible(arr2,k2));
    }
}
