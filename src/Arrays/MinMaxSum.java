package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinMaxSum {
    public static long sumMaxMin(List<Long> nums) {
        Long max = Long.MIN_VALUE;
        Long min = Long.MAX_VALUE;
        for(Long num : nums){
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        return max - Math.abs(min);

    }

    public static void main(String[] args) {
        List<Long> nums = Arrays.asList(-10l, 2l, 4l, 5l, 6l);
        System.out.println(sumMaxMin(nums));
    }
}
