package Arrays;

import java.util.*;


public class FindPair {
    public static List<List<Integer>> findPair(int[] arr)
    {
        int n = arr.length;
        int sum = 0;
        List<List<Integer>> ans = new ArrayList<>();

        Set<Integer> set = new HashSet<>();

        for (Integer num: arr){
            set.add(num);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                sum = arr[i] + arr[j];
                if (set.contains(sum)) {
                   ans.add(Arrays.asList(arr[i], arr[j]));
                }
            }
        }
        ans.sort((a, b) -> {
            if (!a.get(0).equals(b.get(0))) {
                return a.get(0) - b.get(0);
            } else {
                return a.get(1) - b.get(1);
            }
        });
    return ans;
    }

    public static void main(String[] args) {
        int[] Arr = {10, 4, 8, 13, 5};
        System.out.println(findPair(Arr));
    }
}
